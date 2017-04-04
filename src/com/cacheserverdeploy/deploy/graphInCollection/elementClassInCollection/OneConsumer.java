/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealSecondLine;

/**
 * 某个消费节点ID,其相邻网络节点ID,消费节点的需求量
 * @author TaylorChen
 *
 */
public class OneConsumer implements Comparable<OneConsumer>{

	public final int consumerID;
	public final int oneAdjacentNetNodeID;
	public final int need;
	
	//在dijkstra中使用
	public final int pricePerServerDivideNeed;
	
	/**
	 * @param consumerID
	 * @param oneAdjacentNetNodeID
	 * @param need
	 */
	public OneConsumer(int consumerID, int oneAdjacentNetNodeID, int need) {
		super();
		this.consumerID = consumerID;
		this.oneAdjacentNetNodeID = oneAdjacentNetNodeID;
		this.need = need;
		//在dijkstra中使用
		this.pricePerServerDivideNeed=DealSecondLine.pricePerServer/need;
	}

	/**
	 * TreeSet比较器
	 */
	@Override
	public int compareTo(OneConsumer inputConsumer) {
		// TODO 自动生成的方法存根
		return consumerID-inputConsumer.consumerID;
	}
	
}
