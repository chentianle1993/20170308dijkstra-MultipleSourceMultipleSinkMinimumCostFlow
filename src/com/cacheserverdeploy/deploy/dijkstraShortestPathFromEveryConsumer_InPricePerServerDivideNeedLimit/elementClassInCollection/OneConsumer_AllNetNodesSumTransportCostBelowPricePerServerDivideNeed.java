/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPathFromEveryConsumer_InPricePerServerDivideNeedLimit.elementClassInCollection;

import java.util.TreeSet;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.*;
/**
 * consumer，在最短路径上向consumer运输一件商品的花费<=PricePerServer/Need的所有NetNodesID
 * 
 * 使用dijkstra算法
 * 
 */
public class OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed implements Comparable<OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed>{
	/**
	 *构造器
	 * @param consumerAsDijkstraStarter
	 */
	public OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed(
			OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed 
				consumerAsDijkstraStarter) {
		super();
		this.consumerAsDijkstraStarter = consumerAsDijkstraStarter;
		
		//将consumer相邻的网络节点加入候选集
		addConsumerAdjacentNetNodeToAllCandidateNetNodes_SumTransportCost();
		
		this.setAllNetNodesIDInPricePerServerDivideNeedLimit();
	}
	/**
	 * 循环，在候选节点的集合中不断抽取最近的节点加入临近结点集合
	 * 直到候选节点集合为空，
	 * 或候选集中最近点的运输费用超过了PricePerServer/Need
	 */
	private void setAllNetNodesIDInPricePerServerDivideNeedLimit() {
		OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
			nearestCandidateNetNode
				=allCandidateNetNodes_SumTransportCost.first();
		while(nearestCandidateNetNode!=null&&nearestCandidateNetNode
				.sumTransportCostPerCommodityInDijkstraShortestPath
				<=consumerAsDijkstraStarter.pricePerServerDivideNeed){
			//先在候选集中删除该点，加入临近集
			//然后遍历这个点的邻接点集合，
			//若该点不在候选集或临近集内，
			//且更新后的单位运输费用小于pricePerServerDivideNeed
			//则将该点加入临近集
			allCandidateNetNodes_SumTransportCost.remove(nearestCandidateNetNode);
			allNetNodesSumTransportCostBelowPricePerServerDivideNeed.add(nearestCandidateNetNode);
			traverseAdjacentNetNode_Check_JoinAllCandidataNetNodes(nearestCandidateNetNode);
		}
	}
	/**
	 * 遍历nearestCandidateNetNode的邻接点集合，
	 * 若该点不在候选集或临近集内，
	 * 且更新后的单位运输费用小于pricePerServerDivideNeed,
	 * 则将该点加入临近集
	 * @param nearestCandidateNetNode
	 */
	private void traverseAdjacentNetNode_Check_JoinAllCandidataNetNodes(
			OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath nearestCandidateNetNode) {
		TreeSet<OneAdjacentNetNodeID_Capacity_PricePerUnit> 
			allAdjacentNetNodesID_Capacity_PricePerUnit
			=AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit
			.getAllAdjacentNetNodesID_Capacity_PricePerUnit(
					nearestCandidateNetNode.endNetNodeID
					);
		//遍历查找结果中的相邻节点
		//若该点不在候选集或临近集内，
		//且更新后的单位运输费用小于pricePerServerDivideNeed,
		//则将该点加入候选集
		for(OneAdjacentNetNodeID_Capacity_PricePerUnit oneAdjacentNetNodeID_Capacity_PricePerUnit
				:allAdjacentNetNodesID_Capacity_PricePerUnit){
			
			//构造对象，即构造oneAdjacentNetNodeID_Capacity_PricePerUnit对应的OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
			OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
				thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
				=new OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath(
						oneAdjacentNetNodeID_Capacity_PricePerUnit.adjacentNetNodeID
						,nearestCandidateNetNode
							.sumTransportCostPerCommodityInDijkstraShortestPath
							+oneAdjacentNetNodeID_Capacity_PricePerUnit.pricePerUnit);
			//构造对象完毕,在候选集中找到该对象，并更新sumTransportCost
			OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
				resInCandidateNetNodes=allCandidateNetNodes_SumTransportCost.floor(thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath);
			if(thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath.equals(resInCandidateNetNodes)){
				//候选集中有这个节点,可能要更新这个节点的距离
				if(resInCandidateNetNodes.sumTransportCostPerCommodityInDijkstraShortestPath>thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath.sumTransportCostPerCommodityInDijkstraShortestPath){
					resInCandidateNetNodes.sumTransportCostPerCommodityInDijkstraShortestPath=thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath.sumTransportCostPerCommodityInDijkstraShortestPath;
				}
				return;
			}
			//候选集中没有该节点，若该点不在临近集内，
			//且更新后的单位运输费用小于pricePerServerDivideNeed,
			//则将该点加入候选集
			if((!allAdjacentNetNodesID_Capacity_PricePerUnit
					.contains(oneAdjacentNetNodeID_Capacity_PricePerUnit))
				&&(thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
						.sumTransportCostPerCommodityInDijkstraShortestPath
						<=consumerAsDijkstraStarter.pricePerServerDivideNeed)){
				allCandidateNetNodes_SumTransportCost.add(thisEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath);
			}
		}
		
				
			
		
	}

	/**
	 * 将consumer相邻的网络节点加入候选集
	 */
	private void addConsumerAdjacentNetNodeToAllCandidateNetNodes_SumTransportCost() {
		OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath 
			oneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
			=new OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath(
				consumerAsDijkstraStarter.oneAdjacentNetNodeID,0
				);
		allCandidateNetNodes_SumTransportCost.add(
			oneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath
			);
	}
	
	
	
	//成员变量
	/**
	 * 消费节点作为Dijkstra起点
	 */
	public OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed 
			consumerAsDijkstraStarter;
	/**
	 * 候选节点集合
	 */
	public TreeSet<OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath> 
			allCandidateNetNodes_SumTransportCost=new TreeSet<>();
	/**
	 * Dijkstra近邻节点集合
	 */
	public TreeSet<OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath>
			allNetNodesSumTransportCostBelowPricePerServerDivideNeed
				=new TreeSet<>();
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed arg0) {
		// TODO 自动生成的方法存根
		return consumerAsDijkstraStarter.consumerID-arg0.consumerAsDijkstraStarter.consumerID;
	}

}
