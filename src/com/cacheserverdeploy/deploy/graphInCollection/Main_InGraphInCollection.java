/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.GraphContent;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealAllEdges_NetNodeID_AdjacentNetNodeID_Capacity_PricePerUnit;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealSecondLineInGraphContent_PricePerServer;

/**
 * @author TaylorChen
 *
 */
public class Main_InGraphInCollection {
	public static void main_InGraphInCollection(String[] graphContent) {
		GraphContent.graphContent = graphContent;
		DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount.setNetNodesCount_UndirectedEdgesCount_ConsumersCount();
		DealSecondLineInGraphContent_PricePerServer.setPricePerServer();
		DealAllEdges_NetNodeID_AdjacentNetNodeID_Capacity_PricePerUnit.dealAllEdges_NetNodeID_AdjacentNetNodeID_Capacity_PricePerUnit();
		DealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed.dealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed();
	}
}
