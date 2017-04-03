/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

/**
 * 若有其他边的实现，应继承此类
 * @author TaylorChen
 */
public class OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit {
	public int startNetNodeID;
	public int endNetNodeID;
	public int capacity;
	public int pricePerUnit;
	/**
	 * @param startNetNodeID
	 * @param endNetNodeID
	 * @param capacity
	 * @param pricePerUnit
	 */
	public OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit(int startNetNodeID
			, int endNetNodeID, int capacity, int pricePerUnit) {
		super();
		this.startNetNodeID = startNetNodeID;
		this.endNetNodeID = endNetNodeID;
		this.capacity = capacity;
		this.pricePerUnit = pricePerUnit;
	}
}
