/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent;


import java.util.TreeSet;
import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneAdjacentNetNodeID_Capacity_PricePerUnit;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit;

/**
 * 遍历处理graphContent第三部分
 * @author TaylorChen
 *
 */
public class DealAllEdges_NetNodeID_AdjacentNetNodeID_Capacity_PricePerUnit {
	public static OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit;
	public static void dealAllEdges_NetNodeID_AdjacentNetNodeID_Capacity_PricePerUnit() {
		//遍历文件中的每行内容
		for(int i=4;i<4+DealZerothLineInGraphContent_NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			//构造正向边
			constructObjctBottomUp(ithLine[0],ithLine[1],ithLine[2],ithLine[3]);
			//调用上层函数，自顶向下开始执行
			AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit
				.addOrUpdateOneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit_ToAllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit(
						oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit
							);
			
			//构造反向边
			constructObjctBottomUp(ithLine[1],ithLine[0],ithLine[2],ithLine[3]);
			//调用上层函数，自顶向下开始执行
			AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit
				.addOrUpdateOneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit_ToAllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit(
						oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit
							);
			
		}
	}
	/**
	 * 自底向上构造OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit对象,
	 * 以便在上层调用方法
	 * @param startNetNodeID
	 * @param adjacentNetNodeID
	 * @param capacity
	 * @param pricePerUnit
	 */
	private static void constructObjctBottomUp(int startNetNodeID
			, int endNetNodeID, int capacity, int pricePerUnit){
		OneAdjacentNetNodeID_Capacity_PricePerUnit oneAdjacentNetNodeID_Capacity_PricePerUnit
			=new OneAdjacentNetNodeID_Capacity_PricePerUnit(
				endNetNodeID, capacity,pricePerUnit);
		TreeSet<OneAdjacentNetNodeID_Capacity_PricePerUnit>
				allAdjacentNetNodesID_Capacity_PricePerUnit
						=new TreeSet<>();
		allAdjacentNetNodesID_Capacity_PricePerUnit.add(
				oneAdjacentNetNodeID_Capacity_PricePerUnit);
		oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit
				=new OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit(
						startNetNodeID, allAdjacentNetNodesID_Capacity_PricePerUnit);
	}
}
