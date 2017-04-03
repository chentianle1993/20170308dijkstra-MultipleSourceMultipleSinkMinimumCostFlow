/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

import java.util.ArrayList;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit;

/**
 * 处理graphContent第三部分，将所有无向边转化成有向边存储
 * @author TaylorChen
 *
 */
public class AllDirectedEdges_NetNodeID_NetNodeID_Capacity_PricePerUnit {
	public static ArrayList<OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit>
			allDirectedEdges=new ArrayList<>();
			
	public static void setAllDirectedEdges() {
		//遍历文件中的每行内容
		for(int i=4;i<4+NetNodesCount_UndirectedEdgesCount_ConsumersCount.undirectedEdgesCount;i++){
			int[] ithLine=GraphContent.getNthLineInInputFileToIntArray(i);
			allDirectedEdges.add(
					new OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit(
							ithLine[0], ithLine[1],ithLine[2],ithLine[3]
							)
					);
			allDirectedEdges.add(
					new OneDirectedEdge_StartNetNodeID_EndNetNodeID_Capacity_pricePerUnit(
							ithLine[1], ithLine[0],ithLine[2],ithLine[3]
							)
					);
		}
	}
}
