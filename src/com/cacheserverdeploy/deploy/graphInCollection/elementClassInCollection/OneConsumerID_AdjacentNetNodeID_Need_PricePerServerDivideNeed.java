/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

import com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent.DealSecondLineInGraphContent_PricePerServer;

/**
 * 某个消费节点ID,其相邻网络节点ID,消费节点的需求量
 * @author TaylorChen
 *
 */
public class OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed {

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
	public OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed(int consumerID, int oneAdjacentNetNodeID, int need) {
		super();
		this.consumerID = consumerID;
		this.oneAdjacentNetNodeID = oneAdjacentNetNodeID;
		this.need = need;
		//在dijkstra中使用
		this.pricePerServerDivideNeed=DealSecondLineInGraphContent_PricePerServer.pricePerServer/need;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.consumerID;
		return result;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed other = (OneConsumerID_AdjacentNetNodeID_Need_PricePerServerDivideNeed) obj;
		if (this.consumerID != other.consumerID)
			return false;
		return true;
	}
	
}
