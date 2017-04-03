/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

import java.util.ArrayList;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumerID_AdjacentNetNodeID_Need;

/**
 * @author TaylorChen
 *
 */
public class AllConsumersID_AdjacentNetNodeID_Need {
	public static ArrayList<OneConsumerID_AdjacentNetNodeID_Need>
			allConsumersID_AdjacentNetNodeID_Need;
			
	public static void setAllConsumersID_AdjacentNetNodeID_Need() {	
		//遍历第四部分
		for(int i=5+NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount
				;i<5
				+NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount
				+NetNodesCount_UndirectedEdgesCount_ConsumersCount.consumersCount
				;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			allConsumersID_AdjacentNetNodeID_Need.add(
					new OneConsumerID_AdjacentNetNodeID_Need(
							ithLine[0], ithLine[1], ithLine[2]
							)
					);
		}
	}
}
