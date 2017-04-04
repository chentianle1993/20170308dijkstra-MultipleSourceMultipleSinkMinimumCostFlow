/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.graphInCollection.elementClassInCollection.OneNetNode;



/**
 * 
 * @author TaylorChen
 *
 */
public class AllNetNodes {
	public static TreeSet<OneNetNode> allNetNodes=new TreeSet<>();
	/**
	 * 添加一个OneStarterNetNodeID_AllAdjacentNetNodesID_PricePerUnit元素进入集合
	 * @param inputNetNode
	 */
	public static void addOrUpdate(OneNetNode inputNetNode){
		//如果输入为空，则返回
		if(inputNetNode==null){
			return;
		}
		OneNetNode resOfSearch=get(inputNetNode);
		if(resOfSearch==null){
			//集合中不存在此元素，直接加入即可
			allNetNodes.add(inputNetNode);
		}else{
			//若集合中存在此元素，则需要更新此元素
			//将两个元素的allEndNetNodes合并，
			//需要将oneNetNode.AllEndNetNodes中的每一个元素addOrUpdate到resOfSearch.AllEndNetNodes
			//因为两个集合可能会有pricePerUnit的差别,此处不能使用standardLibrary
			resOfSearch.update(inputNetNode);
		}
	}
	/**
	 * 获得某个netNodeID的所有相邻节点集合
	 * @param netNodeID
	 * @return
	 */
	public static OneNetNode get(OneNetNode inputNetNode) {
		if(inputNetNode==null){
			return null;
		}
		//查找结果
		OneNetNode resOfSearch=allNetNodes.floor(inputNetNode);
		if(inputNetNode.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
	}
}
