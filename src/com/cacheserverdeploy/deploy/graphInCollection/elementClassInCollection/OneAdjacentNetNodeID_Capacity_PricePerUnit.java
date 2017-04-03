/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

/**
 * 一个节点，它到相邻节点的距离，用于GraphContent的初始化
 * 将distance作为TreeSet排序的依据，可用于Dijkstra算法中选出最近距离的NetNodeID
 * @author TaylorChen
 *
 */
public class OneAdjacentNetNodeID_Capacity_PricePerUnit implements Comparable<OneAdjacentNetNodeID_Capacity_PricePerUnit>{
	/**
	 * 构造方法
	 * @param adjacentNetNodeIDNetNodeID
	 * @param pricePerUnit
	 */
	public OneAdjacentNetNodeID_Capacity_PricePerUnit(int adjacentNetNodeIDNetNodeID, int capacity, int PricePerUnit) {
		super();
		this.adjacentNetNodeID = adjacentNetNodeIDNetNodeID;
		this.capacity=capacity;
		this.pricePerUnit = PricePerUnit;
	}
	
	public final int adjacentNetNodeID;
	public int capacity;
	public int pricePerUnit;

	/**
	 * @param pricePerUnit 要设置的 pricePerUnit
	 */
	public void setDistance(int pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	/**
	 * TreeSet需要将此按Distance的大小将NetNodeID插入到TreeSet中
	 */
	@Override
	public int compareTo(OneAdjacentNetNodeID_Capacity_PricePerUnit anotherNetNodeID_Distance){
		return (pricePerUnit-anotherNetNodeID_Distance.pricePerUnit);
	}
	
	/**
	 * 主键OneNetNodeID不能重复
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//之前的代码不可以删除，如果obj不能强制转换，则程序出错
		OneAdjacentNetNodeID_Capacity_PricePerUnit other = (OneAdjacentNetNodeID_Capacity_PricePerUnit) obj;
		if (this.adjacentNetNodeID != other.adjacentNetNodeID)
			return false;
		return true;
	}
	
}
