/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

import java.util.TreeSet;

/**
 * 某个节点，与其相邻的所有节点以及距离
 * @author TaylorChen
 *
 */
public class OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit 
		implements Comparable<OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit> {
	/**
	 * 自顶向下的构造器
	 * @param starterNetNodeID
	 * @param allAdjacentNetNodesID_Capacity_PricePerUnit
	 */
	public OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit(
			int starterNetNodeID
				,TreeSet<OneEndNetNodeID_Capacity_PricePerUnit> 
					allAdjacentNetNodesID_Capacity_PricePerUnit) {
		super();
		this.starterNetNodeID = starterNetNodeID;
		this.allAdjacentNetNodesID_Capacity_PricePerUnit=allAdjacentNetNodesID_Capacity_PricePerUnit;
	}
	/**
	 * 在与OneNetNode相邻的节点的集合中修改或增加一个OneNetNodeID_PricePerUnit
	 * @param oneNetNodeID_PricePerUnit
	 */
	public void addOrUpdateOneNetNodeID_PricePerUnitToAllAdjacentNetNodesID_PricePerUnit(
			OneEndNetNodeID_Capacity_PricePerUnit oneEndNetNodeID_Capacity_PricePerUnit){
		OneEndNetNodeID_Capacity_PricePerUnit floorEndNetNodeID_Capacity_PricePerUnit=
				allAdjacentNetNodesID_Capacity_PricePerUnit.floor(oneEndNetNodeID_Capacity_PricePerUnit);
		if(!oneEndNetNodeID_Capacity_PricePerUnit.equals(floorEndNetNodeID_Capacity_PricePerUnit)){
			//集合中不包含此元素
			allAdjacentNetNodesID_Capacity_PricePerUnit.add(oneEndNetNodeID_Capacity_PricePerUnit);
		}
		else{
			//集合中包含此元素，需要update
			if(floorEndNetNodeID_Capacity_PricePerUnit.pricePerUnit<=oneEndNetNodeID_Capacity_PricePerUnit.pricePerUnit){
				//集合中的元素比输入的元素的距离更近或相同，则保留集合中的元素
				return;
			}
			else{
				//注意不能直接赋值，因为update后的元素PricePerUnit可能会变更，需要修改元素在树中的位置
				allAdjacentNetNodesID_Capacity_PricePerUnit.remove(floorEndNetNodeID_Capacity_PricePerUnit);
				allAdjacentNetNodesID_Capacity_PricePerUnit.add(oneEndNetNodeID_Capacity_PricePerUnit);
			}
		}
	}

	/**
	 * 主键thisNetNodeID不能重复
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit other = (OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit) obj;
		if (this.starterNetNodeID != other.starterNetNodeID)
			return false;
		return true;
	}
	
	
	public int starterNetNodeID;
	/**
	 * 按PricePerUnit的大小将oneNetNodeID_PricePerUnit插入到TreeSet中
	 */
	public TreeSet<OneEndNetNodeID_Capacity_PricePerUnit> 
			allAdjacentNetNodesID_Capacity_PricePerUnit=new TreeSet<>();
			
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit anotherStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit) {
		// TODO 自动生成的方法存根
		return starterNetNodeID-anotherStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit.starterNetNodeID;
	}

}
