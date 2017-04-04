/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneAdjacentNetNode;

/**
 * @author TaylorChen
 *
 */
public class AllAdjacentNetNodes {
	
	/**
	 * 每个网络节点都有一个相邻节点的集合，故此处不为静态变量
	 */
	public TreeSet<OneAdjacentNetNode> allAdjacentNetNodes;

	/**
	 * 构造器
	 * @usedIn OneNetNode.java
	 */
	public AllAdjacentNetNodes() {
		super();
		this.allAdjacentNetNodes=new TreeSet<OneAdjacentNetNode>();
	}
	/**构造器
	 * @param inputAdjacentNetNode
	 * @usedIn DealAllEdges.java
	 */
	public AllAdjacentNetNodes(OneAdjacentNetNode inputAdjacentNetNode) {
		this();
		this.allAdjacentNetNodes.add(inputAdjacentNetNode);
	}
	/**
	 * @param inputAdjacentNetNode
	 * @return
	 */
	public OneAdjacentNetNode get(OneAdjacentNetNode inputAdjacentNetNode){
		if(inputAdjacentNetNode==null){
			return null;
		}
		OneAdjacentNetNode resOfSearch=allAdjacentNetNodes.floor(inputAdjacentNetNode);
		if(inputAdjacentNetNode.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
	}
	/**
	 * 在与OneNetNode相邻的节点的集合中修改或增加一个OneNetNodeID_PricePerUnit
	 * @param oneNetNodeID_PricePerUnit
	 */
	public void addOrUpdate(OneAdjacentNetNode inputAdjacenNetNode){
			allAdjacentNetNodes.add(inputAdjacenNetNode);

	}
	/**	
	 * 将两个元素的allAdjacentNetNodes合并，
	 * 需要将oneNetNode.AllAdjacentNetNodes中的每一个元素addOrUpdate到resOfSearch.AllAdjacentNetNodes,
	 * 因为输入集合可能会有pricePerUnit的差别,故此处不能使用standardLibrary
	 * @param inputAllAdjacentNetNodes
	 */
	public void union(AllAdjacentNetNodes inputAllAdjacentNetNodes){

		for(OneAdjacentNetNode oneAdjacentNetNode : inputAllAdjacentNetNodes.allAdjacentNetNodes){
			this.addOrUpdate(oneAdjacentNetNode);
		};
	}

}
