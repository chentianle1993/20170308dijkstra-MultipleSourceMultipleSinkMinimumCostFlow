/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

/**
 * 某个相邻节点ID,到此节点的边上的容量，到此节点的距离，用于GraphContent的初始化
 * 
 * 
 * 将distance作为TreeSet排序的依据，可用于Dijkstra算法中选出最近距离的NetNodeID
 * @author TaylorChen
 * @see 子类用于计算dijkstra shortest path,com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection
 */
public class OneAdjacentNetNode implements Comparable<OneAdjacentNetNode>{
	public final int adjacentNetNodeID;
	public int capacity;
	public int pricePerUnit;
	/**构造器
	 * @param adjacentNetNodeID
	 * @param capacity
	 * @param pricePerUnit
	 */
	public OneAdjacentNetNode(int adjacentNetNodeID, int capacity, int pricePerUnit) {
		super();
		this.adjacentNetNodeID = adjacentNetNodeID;
		this.capacity = capacity;
		this.pricePerUnit = pricePerUnit;
	}
	/**
	 * TreeSet比较器
	 */
	@Override
	public int compareTo(OneAdjacentNetNode anotherAdjacentNetNode){
		return (pricePerUnit-anotherAdjacentNetNode.pricePerUnit);
	}
	
	/**
	 * 主键adjacentNetNodeID可以重复，
	 * 因为TreeSet只能使用一个Comparator，
	 * 因此adjacentNetNodeID重复或者pricePerUnit重复，可以保证正确性
	 */
}
