/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent;

import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed;

/**
 * 遍历处理graphContent的第四部分
 * @author TaylorChen
 *
 */
public class DealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed {
	public static void dealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed() {
		//遍历第四部分
		for(int i=5+DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount
				;i<5
				+DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount
				+DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount.consumersCount
				;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			//自底向上构造对象
			OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed 
				oneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed
					=new OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed(
						ithLine[0], ithLine[1], ithLine[2]
							);
			AllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed
				.allConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed
					.add(oneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed);
		}
	}
	
}
