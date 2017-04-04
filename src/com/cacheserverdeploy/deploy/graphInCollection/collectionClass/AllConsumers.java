/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneConsumer;

/**
 * @author TaylorChen
 *
 */
public class AllConsumers {
	public static TreeSet<OneConsumer> allConsumers=new TreeSet<>();
	public static void add(OneConsumer inputConsumer) {
		allConsumers.add(inputConsumer);		
	}
	public static OneConsumer get(OneConsumer inputConsumer) {
		if(inputConsumer==null){
			return null;
		}
		OneConsumer resOfSearch=allConsumers.floor(inputConsumer);
		if(inputConsumer.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
		
	}
}
