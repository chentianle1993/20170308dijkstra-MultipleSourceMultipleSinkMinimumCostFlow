/**
 * 
 */
package com.cacheserverdeploy.deploy;

/**
 * inputFile所对应的有向图矩阵
 * 
 * @author TaylorChen
 */
public class InputGraph {

	/**
	 * inputFile对应的有向图矩阵
	 * 矩阵中多余的一行一列作为处理多源多汇最小费用流中新增的源点，汇点
	 */
	public static int routerAmount;
	public static int undirectedEdgeAmount;
	public static int consumerAmount;

	public static int[][] capacityEveryEdge;
	public static int[][] unitPriceEveryEdge;
	
	public static int serverUnitPrice;
	
	public static int[] routerNumAdjoinConsumerNum;
	//消费节点n与网络节点routerNumAdjoinConsumerNum[n]相连,仅用于输出路径

	/**
	 * 生成inputFile所对应的有向图矩阵
	 * 
	 * @param graphContent来自于FileUtil.java中的lines.toArray(new
	 *            String[lines.size()])
	 */
	public static void setGraphInArray(String[] graphContent) {
		// TODO 自动生成的构造函数存根
		InputGraphContent.setInputGraphContent(graphContent);
		// 调用内部类的方法，参数为引用变量不会引起复制
		dealZerothAndSecondLineInInputFile();
		dealUndirectedEdgeLineInInputFile();
		dealConsumerLineInInputFile();
	}
	
	/**
	 * 保存inputFile的内容，内部类只供GraphInArray类使用
	 * 
	 * @author TaylorChen
	 */
	public static class InputGraphContent {
		/**
		 * 保存inputFile的内容
		 */
		public static String[] inputGraphContent;

		/**
		 * 获取inputFile中第lineNumber行构成的int型数组
		 * 
		 * @param lineNumber
		 */
		public static int[] getNthLineInInputFileToIntArray(int lineNumber) {
			// System.out.println(graphContent);
			// graphContent=[50 96 9, , 260, , 0 26 15 7, 0 14 20 3,...]
			String[] nthLineInStringArray = inputGraphContent[lineNumber].split(" ");
			int[] nthLineInInputFileToIntArray = new int[nthLineInStringArray.length];
			for (int i = 0; i < nthLineInStringArray.length; i++) {
				nthLineInInputFileToIntArray[i] = new Integer(nthLineInStringArray[i]);
			}
			return nthLineInInputFileToIntArray;
		}

		/**
		 * 设置静态变量String[] inputGraphContent
		 */
		public static void setInputGraphContent(String[] inputGraphContent) {
			// TODO 自动生成的构造函数存根
			InputGraphContent.inputGraphContent = inputGraphContent;
		}
	}	
	
	/**
	 * 处理inputFile中第一行，第三行
	 */
	public static void dealZerothAndSecondLineInInputFile(){
		//dealZerothLine
		int[] zerothLine=InputGraphContent.getNthLineInInputFileToIntArray(0);
		routerAmount=zerothLine[0];

		capacityEveryEdge=new int[zerothLine[0]+1][zerothLine[0]+1];
		unitPriceEveryEdge=new int[zerothLine[0]+1][zerothLine[0]+1];

		undirectedEdgeAmount=zerothLine[1];
		consumerAmount=zerothLine[2];
		
		routerNumAdjoinConsumerNum=new int[consumerAmount];
		
		//dealSecondLine
		int[] secondLine=InputGraphContent.getNthLineInInputFileToIntArray(2);
		serverUnitPrice=secondLine[0];
	}
	
	/**
	 * 处理inputFile中链路信息所在行，即4th-undirectedEdgeAmount+3行
	 */
	private static void dealUndirectedEdgeLineInInputFile() {
		// TODO 自动生成的方法存根
		for(int i=4;i<4+undirectedEdgeAmount;i++){
			int[] ithLine=InputGraphContent.getNthLineInInputFileToIntArray(i);
			capacityEveryEdge[ithLine[0]][ithLine[1]]
					=capacityEveryEdge[ithLine[1]][ithLine[0]]
							=ithLine[2];
			unitPriceEveryEdge[ithLine[0]][ithLine[1]]
					=unitPriceEveryEdge[ithLine[1]][ithLine[0]]
							=ithLine[3];
		}
	}
	
	/**
	 * 处理inputFile中消费节点与相邻网络节点信息所在行
	 */
	private static void dealConsumerLineInInputFile() {
		// TODO 自动生成的方法存根
		for(int i=5+undirectedEdgeAmount,j=0;i<5+undirectedEdgeAmount+consumerAmount;i++,j++){
			int[] ithLine=InputGraphContent.getNthLineInInputFileToIntArray(i);
			routerNumAdjoinConsumerNum[j]=ithLine[1];//相邻网络节点号

			capacityEveryEdge[ithLine[1]][routerAmount]=ithLine[2];
			//unitPriceEveryEdge[ithLine[1]][routerAmount]=0;//自动初始化
		}
	}
}
