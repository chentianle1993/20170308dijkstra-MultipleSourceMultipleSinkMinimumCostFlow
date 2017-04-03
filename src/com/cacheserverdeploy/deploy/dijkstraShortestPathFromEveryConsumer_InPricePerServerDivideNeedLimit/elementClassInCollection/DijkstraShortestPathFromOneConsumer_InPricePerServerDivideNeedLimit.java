/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPathFromEveryConsumer_InPricePerServerDivideNeedLimit.elementClassInCollection;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.*;
/**
 * 从thisConsumerAsDijkstraStarter开始，
 * 使用dijkstra算法找出consumer在PricePerServerDivideNeedLimit范围内可达的所有NetNodeID
 * @author TaylorChen
 *
 */
public class DijkstraShortestPathFromOneConsumer_InPricePerServerDivideNeedLimit {
	/**
	 * 使用dijkstra算法找出consumer在PricePerServerDivideNeedLimit范围内可达的所有NetNodeID
	 * @param thisConsumerAsDijkstraStarter
	 */
	public DijkstraShortestPathFromOneConsumer_InPricePerServerDivideNeedLimit(
			OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed thisConsumerAsDijkstraStarter) {
		super();
		this.thisConsumerAsDijkstraStarter = thisConsumerAsDijkstraStarter;
		this.setAllNetNodesIDInPricePerServerDivideNeedLimit();
	}
	
	public OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed 
			thisConsumerAsDijkstraStarter;
	public TreeSet<Integer> allNetNodesIDInPricePerServerDivideNeedLimit;
	
	/**
	 * 从thisConsumerAsDijkstraStarter开始，
	 * 使用dijkstra算法找出consumer在PricePerServerDivideNeedLimit范围内可达的所有NetNodeID
	 */
	private void setAllNetNodesIDInPricePerServerDivideNeedLimit() {
		//TODO 
	}
	
}
