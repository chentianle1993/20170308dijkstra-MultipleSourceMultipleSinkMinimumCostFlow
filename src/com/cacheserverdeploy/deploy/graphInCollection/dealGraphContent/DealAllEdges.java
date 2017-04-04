/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent;


import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllAdjacentNetNodes;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllNetNodes;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneAdjacentNetNode;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneNetNode;

/**
 * 遍历处理graphContent第三部分
 * @author TaylorChen
 *
 */
public class DealAllEdges {
	public static OneNetNode netNodeInThisLine;
	public static void dealAllEdges() {
		//遍历文件中的每行内容
		for(int i=4;i<4+DealZerothLine.undirectedEdgesCount;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			//自底向上构造对象,自上而下开始执行
			constructNetNodeInThisLine(ithLine[0],ithLine[1],ithLine[2],ithLine[3]);
			AllNetNodes.addOrUpdate(netNodeInThisLine);
			
			//处理反向边
			constructNetNodeInThisLine(ithLine[1],ithLine[0],ithLine[2],ithLine[3]);
			AllNetNodes.addOrUpdate(netNodeInThisLine);			
		}
	}
	/**
	 * 自底向上构造OneNetNode对象,以便在上层调用方法
	 * @param startNetNodeID
	 * @param endNetNodeID
	 * @param capacity
	 * @param pricePerUnit
	 */
	private static void constructNetNodeInThisLine(int startNetNodeID
			, int endNetNodeID, int capacity, int pricePerUnit){
		OneAdjacentNetNode endNetNodeInThisLine=new OneAdjacentNetNode(endNetNodeID, capacity,pricePerUnit);
		AllAdjacentNetNodes allEndNetNodesInThisLine=new AllAdjacentNetNodes(endNetNodeInThisLine);
		netNodeInThisLine=new OneNetNode(startNetNodeID,allEndNetNodesInThisLine);
	}
}
