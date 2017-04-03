/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection.dealGraphContent;

/**
 * 保存graphContent
 * 
 * @author TaylorChen
 */
public class GraphContent {
	/**
	 * 保存graphContent
	 */
	public static String[] graphContent;

	/**
	 * 获取inputFile中第lineNumber行构成的int型数组
	 * 
	 * @param lineNumber
	 */
	public static int[] getNthLineInInputFileToIntArray(int lineNumber){
		// System.out.println(graphContent);
		// graphContent=[50 96 9, , 260, , 0 26 15 7, 0 14 20 3,...]
		String[] nthLineInStringArray = graphContent[lineNumber].split(" ");
		int[] nthLineInInputFileToIntArray = new int[nthLineInStringArray.length];
		for (int i = 0; i < nthLineInStringArray.length; i++) {
			nthLineInInputFileToIntArray[i] = new Integer(nthLineInStringArray[i]);
		}
		return nthLineInInputFileToIntArray;
	}
}
