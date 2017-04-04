/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent;

import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllConsumers;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumer;

/**
 * 遍历处理graphContent的第四部分
 * @author TaylorChen
 *
 */
public class DealAllConsumers {
	public static void dealAllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed() {
		//遍历第四部分
		for(int i=5+DealZerothLine.undirectedEdgesCount
				;i<5
				+DealZerothLine.undirectedEdgesCount
				+DealZerothLine.consumersCount
				;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			//自底向上构造对象
			OneConsumer consumerOfThisLine=new OneConsumer(ithLine[0], ithLine[1], ithLine[2]);
			AllConsumers.add(consumerOfThisLine);
		}
	}
	
}
