/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection.OneConsumer_AllNearNetNodes;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllConsumers;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumer;

/**
 * @author TaylorChen
 *
 */
public class AllConsumers_AllNearNetNodes {
	public static TreeSet<OneConsumer_AllNearNetNodes> allConsumers_AllNearNetNodes
		=new TreeSet<>();
	public static void setAllConsumers_AllNearNetNodes() {
		for(OneConsumer	oneConsumer: AllConsumers.allConsumers){
			OneConsumer_AllNearNetNodes oneConsumer_AllNearNetNodes
				=new OneConsumer_AllNearNetNodes(oneConsumer);
			allConsumers_AllNearNetNodes.add(oneConsumer_AllNearNetNodes);
		}
	}
}
