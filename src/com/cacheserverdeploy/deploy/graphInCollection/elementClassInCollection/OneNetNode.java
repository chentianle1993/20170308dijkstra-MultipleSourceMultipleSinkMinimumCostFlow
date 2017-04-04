/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection;

import com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllAdjacentNetNodes;

/**
 * 某个节点，与其相邻的所有节点以及距离
 * @author TaylorChen
 *
 */
public class OneNetNode implements Comparable<OneNetNode> {
	public int starterNetNodeID;
	/**
	 * 与此网络节点相邻的所有网络节点的集合
	 */
	public AllAdjacentNetNodes allAdjacentNetNodes;
	
	/**
	 * 构造器
	 * @param starterNetNodeID 起始网络节点
	 * @param allAdjacentNetNodes 与此网络节点相邻的所有网络节点的集合
	 * @usedIn com.cacheserverdeploy.deploy.graphInCollection.collectionClass.AllNetNodes 
	 */
	public OneNetNode(int starterNetNodeID) {
		super();
		this.starterNetNodeID = starterNetNodeID;
		this.allAdjacentNetNodes=new AllAdjacentNetNodes();
	}
	
	/**构造器
	 * @param starterNetNodeID
	 * @param allAdjacentNetNodes
	 * @usedIn DealAllEdges.java
	 */
	public OneNetNode(int starterNetNodeID, AllAdjacentNetNodes allAdjacentNetNodes) {
		this(starterNetNodeID);
		this.allAdjacentNetNodes = allAdjacentNetNodes;
	}	
	/**
	 * 更新成员变量allAdjacentNetNodes
	 * 在与OneNetNode相邻的节点的集合中修改或增加一个OneNetNodeID_PricePerUnit
	 * @param oneNetNodeID_PricePerUnit
	 */
	public void update(OneNetNode inputOneNetNode){
		this.allAdjacentNetNodes.union(inputOneNetNode.allAdjacentNetNodes);
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
		OneNetNode other = (OneNetNode) obj;
		if (this.starterNetNodeID != other.starterNetNodeID)
			return false;
		return true;
	}
	
	

			
	/* （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(OneNetNode anotherStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit) {
		// TODO 自动生成的方法存根
		return starterNetNodeID-anotherStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit.starterNetNodeID;
	}

}
