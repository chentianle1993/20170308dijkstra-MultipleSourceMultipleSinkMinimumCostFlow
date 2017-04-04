/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection.OneNearNetNode;

/**
 * @author TaylorChen
 *
 */
public class AllNearNetNodes {
	public TreeSet<OneNearNetNode> allNetNodes=new TreeSet<>();
	
	public OneNearNetNode get(OneNearNetNode inputPathEndNetNode){
		if(inputPathEndNetNode==null){
			return null;
		}
		OneNearNetNode resOfSearch=allNetNodes.floor(inputPathEndNetNode);
		if(inputPathEndNetNode.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
		
	}
	public void addOrUpdate(OneNearNetNode inputPathEndNetNode){
			allNetNodes.add(inputPathEndNetNode);
	}
	/**	
	 * 将两个元素的allPathEndNetNodes合并，
	 * 因为输入集合可能会有pricePerUnit的差别,故此处不能使用standardLibrary
	 * 需要将oneNetNode.AllPathEndNetNodes中的每一个元素addOrUpdate到resOfSearch.AllEndNetNodes,
	 * @param inputAllAdjacentNetNodes
	 */
	public void union(AllNearNetNodes inputAllPathEndNetNodes) {
		for(OneNearNetNode oneNearNetNode: inputAllPathEndNetNodes.allNetNodes){
			this.addOrUpdate(oneNearNetNode);
		}
	}
}
