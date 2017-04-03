/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

/**
 * 一个节点，它到相邻节点的距离，用于GraphContent的初始化
 * 或者一个节点，它到某个消费节点的距离，用于Dijkstra算法,此时不使用capacity
 * 将distance作为TreeSet排序的依据，可用于Dijkstra算法中选出最近距离的NetNodeID
 * @author TaylorChen
 *
 */
public class OneEndNetNodeID_Capacity_PricePerUnit implements Comparable<OneEndNetNodeID_Capacity_PricePerUnit>{
	/**
	 * 构造方法
	 * @param endNetNodeIDNetNodeID
	 * @param pricePerUnit
	 */
	public OneEndNetNodeID_Capacity_PricePerUnit(int endNetNodeIDNetNodeID, int capacity, int PricePerUnit) {
		super();
		this.endNetNodeID = endNetNodeIDNetNodeID;
		this.capacity=capacity;
		this.pricePerUnit = PricePerUnit;
	}
	
	public final int endNetNodeID;
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
	public int compareTo(OneEndNetNodeID_Capacity_PricePerUnit anotherNetNodeID_Distance){
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
		OneEndNetNodeID_Capacity_PricePerUnit other = (OneEndNetNodeID_Capacity_PricePerUnit) obj;
		if (this.endNetNodeID != other.endNetNodeID)
			return false;
		return true;
	}
	
}
