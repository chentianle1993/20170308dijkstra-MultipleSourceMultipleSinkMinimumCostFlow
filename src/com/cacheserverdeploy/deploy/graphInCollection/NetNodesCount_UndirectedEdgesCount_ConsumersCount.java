/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

/**
 * 处理graphContent中第零行
 * @author TaylorChen
 *
 */
public class NetNodesCount_UndirectedEdgesCount_ConsumersCount {
	public static int netNodesCount;
	public static int undirectedEdgesCount;
	public static int consumersCount;

	public static void setNetNodesCount_UndirectedEdgesCount_ConsumersCount(){
		int[] zerothLine=GraphContent.getNthLineInInputFileToIntArray(0);
		netNodesCount=zerothLine[0];
		undirectedEdgesCount=zerothLine[1];
		consumersCount=zerothLine[2];
	}

}
