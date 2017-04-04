/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection.OneCandidateNetNode;

/**
 * @author TaylorChen
 *
 */
public class AllCandidateNetNodes {
	public TreeSet<OneCandidateNetNode> allNetNodes=new TreeSet<>();
	
	public OneCandidateNetNode get(OneCandidateNetNode inputPathEndNetNode){
		if(inputPathEndNetNode==null){
			return null;
		}
		OneCandidateNetNode resOfSearch=allNetNodes.floor(inputPathEndNetNode);
		if(inputPathEndNetNode.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
		
	}
	public void addOrUpdate(OneCandidateNetNode inputPathEndNetNode){
			allNetNodes.add(inputPathEndNetNode);
	}
	/**	
	 * 将两个元素的allPathEndNetNodes合并，
	 * 因为输入集合可能会有pricePerUnit的差别,故此处不能使用standardLibrary
	 * 需要将oneNetNode.AllPathEndNetNodes中的每一个元素addOrUpdate到resOfSearch.AllEndNetNodes,
	 * @param inputAllAdjacentNetNodes
	 */
	public void union(AllCandidateNetNodes inputAllPathEndNetNodes) {
		for(OneCandidateNetNode oneCandidateNetNode: inputAllPathEndNetNodes.allNetNodes){
			this.addOrUpdate(oneCandidateNetNode);
		}
	}
}
