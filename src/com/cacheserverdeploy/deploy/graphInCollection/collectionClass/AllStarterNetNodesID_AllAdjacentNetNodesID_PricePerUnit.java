/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneEndNetNodeID_Capacity_PricePerUnit;
import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit;



/**
 * 
 * @author TaylorChen
 *
 */
public class AllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit {
	public static TreeSet<OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit>
			allNetNodesID_AllAdjacentNetNodesID_PricePerUnit=new TreeSet<>();
	/**
	 * 添加一个OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit元素进入集合
	 * @param oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit
	 */
	public static void addOrUpdateOneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit_ToAllStarterNetNodesID_AllAdjacentNetNodesID_PricePerUnit(
			OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit){
		OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit floorStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit
			=allNetNodesID_AllAdjacentNetNodesID_PricePerUnit.floor(oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit);
		if(!oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit.equals(floorStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit)){
			//集合中不存在此元素，直接加入即可
			allNetNodesID_AllAdjacentNetNodesID_PricePerUnit.add(oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit);
		}else{
			//若集合中存在此元素，则需要将两个元素的成员变量中的集合
			//allAdjacentNetNodesID_Capacity_PricePerUnit合并，
			//此处不能使用standardLibrary，因为两个集合可能会有pricePerUnit的差别。
			for(OneEndNetNodeID_Capacity_PricePerUnit oneEndNetNodeID_Capacity_PricePerUnit 
					: oneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit.allAdjacentNetNodesID_Capacity_PricePerUnit){
				floorStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit.addOrUpdateOneNetNodeID_PricePerUnitToAllAdjacentNetNodesID_PricePerUnit(oneEndNetNodeID_Capacity_PricePerUnit);
			};
		}
	}
	

}
