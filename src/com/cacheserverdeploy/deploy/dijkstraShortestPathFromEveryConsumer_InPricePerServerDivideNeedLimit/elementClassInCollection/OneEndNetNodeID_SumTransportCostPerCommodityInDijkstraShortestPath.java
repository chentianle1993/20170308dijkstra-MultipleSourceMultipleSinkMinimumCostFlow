
package com.cacheserverdeploy.deploy.dijkstraShortestPathFromEveryConsumer_InPricePerServerDivideNeedLimit.elementClassInCollection;

/**
 * 一个网络节点ID，到它的最短路径上每单位商品的运费
 * @author TaylorChen
 *
 */
public class OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath implements Comparable<OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath>{

	public final int endNetNodeID;
	public int sumTransportCostPerCommodityInDijkstraShortestPath;
	
	/**
	 * 构造器
	 * @param endNetNodeID
	 * @param sumTransportCostPerCommodityInDijkstraShortestPath
	 */
	public OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath(int endNetNodeID,
			int sumTransportCostPerCommodityOfDijkstraShortestPath) {
		super();
		this.endNetNodeID = endNetNodeID;
		this.sumTransportCostPerCommodityInDijkstraShortestPath = sumTransportCostPerCommodityOfDijkstraShortestPath;
	}

	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath arg0) {
		// TODO 自动生成的方法存根
		return (sumTransportCostPerCommodityInDijkstraShortestPath-arg0.sumTransportCostPerCommodityInDijkstraShortestPath);
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
		OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath other = (OneEndNetNodeID_SumTransportCostPerCommodityInDijkstraShortestPath) obj;
		if (this.endNetNodeID != other.endNetNodeID)
			return false;
		return true;
	}
	


}
