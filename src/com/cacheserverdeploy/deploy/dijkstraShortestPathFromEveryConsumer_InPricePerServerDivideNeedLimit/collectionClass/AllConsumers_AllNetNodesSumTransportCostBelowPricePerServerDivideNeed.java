/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPathFromEveryConsumer_InPricePerServerDivideNeedLimit.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.dijkstraShortestPathFromEveryConsumer_InPricePerServerDivideNeedLimit.elementClassInCollection.OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed;

/**
 * @author TaylorChen
 *
 */
public class AllConsumers_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed {
	public static TreeSet<OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed>
			allConsumers_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed;
	public static void setAllConsumers_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed() {
		for(OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed
				oneConsumer: AllConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed
					.allConsumersID_AdjacentNetNodeID_Need_PricePerServerDivideNeed){
			OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed 
				oneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed
				=new OneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed(
						oneConsumer);
			allConsumers_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed
				.add(oneConsumer_AllNetNodesSumTransportCostBelowPricePerServerDivideNeed);
		}
	}
}
