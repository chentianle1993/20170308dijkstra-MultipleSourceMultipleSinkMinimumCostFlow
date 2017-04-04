/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealAllConsumers;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealAllEdges;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealSecondLine;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealZerothLine;
import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.GraphContent;

/**
 * @author TaylorChen
 *
 */
public class Main_InGraphInCollection {
	public static void main_InGraphInCollection(String[] graphContent) {
		GraphContent.graphContent = graphContent;
		DealZerothLine.setNetNodesCount_UndirectedEdgesCount_ConsumersCount();
		DealSecondLine.setPricePerServer();
		DealAllEdges.dealAllEdges();
		DealAllConsumers.dealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed();

	}

}
