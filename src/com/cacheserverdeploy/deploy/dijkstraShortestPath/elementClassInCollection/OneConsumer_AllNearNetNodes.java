/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection;

import java.util.Iterator;

import com.cacheserverdeploy.deploy.dijkstraShortestPath.collectionClass.AllPathEndNetNodes;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllNetNodes;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneAdjacentNetNode;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumer;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneNetNode;
/**
 * 从consumer出发，使用Dijkstra算法，获得consumer的近邻节点集合，候选节点集合，
 */
public class OneConsumer_AllNearNetNodes implements Comparable<OneConsumer_AllNearNetNodes>{
	//成员变量
	/**
	 * 消费节点作为Dijkstra起点，已含有pricePerServerDivideNeed域
	 */
	public OneConsumer consumer;
	/**
	 * 候选节点集合
	 */
	public AllPathEndNetNodes allCandidateNetNodes;
	/**
	 * 已经确认的近邻节点集合，集合内的节点与consumer的距离均<=每台服务器价格/consumer的需求
	 */
	public AllPathEndNetNodes allNearNetNodes;
	
	/**
	 *构造器
	 * @param consumer 属于graphInCollection包中的OneConsumer
	 * @see com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection
	 */
	public OneConsumer_AllNearNetNodes(OneConsumer consumer) {
		super();
		this.consumer = consumer;
		allCandidateNetNodes=new AllPathEndNetNodes();
		allNearNetNodes=new AllPathEndNetNodes();
		//使用Dijkstra算法获得consumer的近邻节点集合
		setAllNetNodes();
	}
	/**
	 * 使用Dijkstra算法获得consumer的近邻节点集合
	 */
	private void setAllNetNodes() {
		//将consumer相邻的网络节点加入候选集
		addConsumerAdjacentNetNodeToAllCandidateNetNodes();
		
		/**
		 * 为了不在Dijkstra算法中改变已经存储的OneAdjacentNetNode中的pricePerUnit
		 * ,破坏已存储的图结构，在加入近邻集或候选集之前需要new一个对象
		 * 近邻集与候选集中全部是OnePathEndNetNode的对象,与OneAdjacentNetNode无关
		 * 近邻集：
		 * 候选集:在加入时已确认pricePerUnit不大于pricePerServer/Need
		 */
		
		
		/**
		 * 一级循环：
		 * 在候选节点的集合中获取并删除最近的节点joinToAllNearNetNode，
		 * 加入近邻节点集合
		 * 循环条件:候选节点的结合不为空
		 */
		OnePathEndNetNode joinToAllNearNetNode=allCandidateNetNodes.allNetNodes.first();
		while(joinToAllNearNetNode!=null){
			allCandidateNetNodes.allNetNodes.remove(joinToAllNearNetNode);
			allNearNetNodes.allNetNodes.add(joinToAllNearNetNode);
			
			/**
			 * 二级循环：
			 * 遍历justJoinedToAllNearNetNode的所有邻居，从小到大，
			 * 循环条件：
			 * joinToAllNearNetNode.price+price<joinToAllNearNetNode><=pricePerServer/Need
			 */
			OneNetNode searchTemp=new OneNetNode(joinToAllNearNetNode.pathEndNetNodeID);
			OneNetNode resOfSearch=AllNetNodes.get(searchTemp);
			if(resOfSearch==null){
				//孤立节点
				break;
			}
			Iterator<OneAdjacentNetNode> iterator=resOfSearch.allAdjacentNetNodes.allAdjacentNetNodes.iterator();
			while(iterator.hasNext()){
				OneAdjacentNetNode adjacentNetNode=iterator.next();
				int moreOrLessPriceOfWholePath=joinToAllNearNetNode.pricePerUnitOfWholePath
						+adjacentNetNode.pricePerUnit;
				if(moreOrLessPriceOfWholePath>consumer.pricePerServerDivideNeed){
					//路径太远，循环停止
					break;
				}else{
					//路径在范围内，加入候选集
					OnePathEndNetNode temp=new OnePathEndNetNode(adjacentNetNode.adjacentNetNodeID
							, moreOrLessPriceOfWholePath);
					allCandidateNetNodes.addOrUpdate(temp);
				}
			}//邻居节点为空时，循环停止
			
		}//候选集为空时，循环停止
	}

	/**
	 * 将与consumer相邻的网络节点加入候选集
	 */
	private void addConsumerAdjacentNetNodeToAllCandidateNetNodes() {
		OnePathEndNetNode adjacentNetNode=new OnePathEndNetNode(consumer.oneAdjacentNetNodeID, 0);
		allCandidateNetNodes.addOrUpdate(adjacentNetNode);
	}
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneConsumer_AllNearNetNodes arg0) {
		// TODO 自动生成的方法存根
		return consumer.consumerID-arg0.consumer.consumerID;
	}	
	
	


}
