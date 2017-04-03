/**
 * 
 */
package com.cacheserverdeploy.deploy.graphInCollection;

/**
 * 处理graphContent中第二行
 * @author TaylorChen
 *
 */
public class PricePerServer {
	public static int pricePerServer;
	
	public static void setPricePerServer(){
		int[] secondLine=GraphContent.getNthLineInInputFileToIntArray(2);
		pricePerServer=secondLine[0];
	}
}
