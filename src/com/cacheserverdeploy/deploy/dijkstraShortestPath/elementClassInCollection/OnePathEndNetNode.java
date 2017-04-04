/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection;

/**
 * 某个路径的网络终节点ID,到此节点的总运输费用/单位商品
 * @author TaylorChen
 * @usedIn OneConsumer_AllNearNetNodes.java
 */
public class OnePathEndNetNode implements Comparable<OnePathEndNetNode>{
	public final int pathEndNetNodeID;
	public int pricePerUnitOfWholePath;
	
	/**构造方法
	 * @param pathEndNetNodeID
	 * @param pricePerUnitOfWholePath
	 */
	public OnePathEndNetNode(int pathEndNetNodeID, int pricePerUnitOfWholePath) {
		super();
		this.pathEndNetNodeID = pathEndNetNodeID;
		this.pricePerUnitOfWholePath = pricePerUnitOfWholePath;
	}

	
	
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OnePathEndNetNode anotherPathEndNetNode) {
		// TODO 自动生成的方法存根
		return (pricePerUnitOfWholePath-anotherPathEndNetNode.pricePerUnitOfWholePath);
	}

}
