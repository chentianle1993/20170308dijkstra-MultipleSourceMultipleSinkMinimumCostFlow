/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection;

/**
 * 某个路径的网络终节点ID,到此节点的总运输费用/单位商品
 * @author TaylorChen
 * @usedIn OneConsumer_AllNearNetNodes.java
 */
public class OneNearNetNode implements Comparable<OneNearNetNode>{
	public int pathEndNetNodeID;
	public int pricePerUnitOfWholePath;
	
	/**构造方法
	 * @param pathEndNetNodeID
	 * @param pricePerUnitOfWholePath
	 */
	public OneNearNetNode(int pathEndNetNodeID, int pricePerUnitOfWholePath) {
		super();
		this.pathEndNetNodeID = pathEndNetNodeID;
		this.pricePerUnitOfWholePath = pricePerUnitOfWholePath;
	}




	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneNearNetNode anotherPathEndNetNode) {
		// TODO 自动生成的方法存根
		return (pricePerUnitOfWholePath-anotherPathEndNetNode.pricePerUnitOfWholePath);
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
		OneNearNetNode other = (OneNearNetNode) obj;
		if (this.pathEndNetNodeID != other.pathEndNetNodeID)
			return false;
		return true;
	}


}
