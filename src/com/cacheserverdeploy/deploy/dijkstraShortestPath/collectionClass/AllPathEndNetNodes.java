/**
 * 
 */
package com.cacheserverdeploy.deploy.dijkstraShortestPath.collectionClass;

import java.util.TreeSet;

import com.cacheserverdeploy.deploy.dijkstraShortestPath.elementClassInCollection.OnePathEndNetNode;

/**
 * @author TaylorChen
 *
 */
public class AllPathEndNetNodes {
	public TreeSet<OnePathEndNetNode> allNetNodes=new TreeSet<>();
	
	public OnePathEndNetNode get(OnePathEndNetNode inputPathEndNetNode){
		if(inputPathEndNetNode==null){
			return null;
		}
		OnePathEndNetNode resOfSearch=allNetNodes.floor(inputPathEndNetNode);
		if(inputPathEndNetNode.equals(resOfSearch)){
			return resOfSearch;
		}
		return null;
		
	}
	public void addOrUpdate(OnePathEndNetNode inputPathEndNetNode){
		OnePathEndNetNode resOfSearch=get(inputPathEndNetNode);
		if(resOfSearch==null){
			//集合中不包含此元素，直接add
			allNetNodes.add(inputPathEndNetNode);
		}else{
			//集合中包含此元素，
			//若输入元素更优，因为TreeSet是根据pricePerUnit构造的，
			//所以需要在集合中删除原来的元素，再添加输入的元素，
			//这一步不能放在下一级实现
			if(inputPathEndNetNode.pricePerUnitOfWholePath<resOfSearch.pricePerUnitOfWholePath){
				//输入的元素比集合中的元素每单位商品运输费用更小，需更新树
				//注意不能直接赋值，因为update后的元素PricePerUnit可能会变更，需要修改元素在树中的位置
				allNetNodes.remove(resOfSearch);
				allNetNodes.add(inputPathEndNetNode);
			}
			
		}
	}
	/**	
	 * 将两个元素的allPathEndNetNodes合并，
	 * 因为输入集合可能会有pricePerUnit的差别,故此处不能使用standardLibrary
	 * 需要将oneNetNode.AllPathEndNetNodes中的每一个元素addOrUpdate到resOfSearch.AllEndNetNodes,
	 * @param inputAllAdjacentNetNodes
	 */
	public void union(AllPathEndNetNodes inputAllPathEndNetNodes) {
		for(OnePathEndNetNode onePathEndNetNode: inputAllPathEndNetNodes.allNetNodes){
			this.addOrUpdate(onePathEndNetNode);
		}
	}
}
