/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

/**
 * @author TaylorChen
 *
 */
public class MainClass {
	public static void mainClass(String[] graphContent) {
		GraphContent.graphContent = graphContent;
		NetNodesCount_UndirectedEdgesCount_ConsumersCount.setNetNodesCount_UndirectedEdgesCount_ConsumersCount();
		PricePerServer.setPricePerServer();
		AllDirectedEdges_NetNodeID_NetNodeID_Capacity_PricePerUnit.setAllDirectedEdges();
		AllConsumersID_AdjacentNetNodeID_Need.setAllConsumersID_AdjacentNetNodeID_Need();
	}
}
