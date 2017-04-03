package com.cacheserverdeploy.deploy;

/**
 * @author QQ353688193
 *
 */
public class Deploy
{
    /**
     * 你需要完成的入口
     * <功能详细描述>
     * @param graphContent 用例信息文件
     * @return [参数说明] 输出结果信息
     * @see [类、类#方法、类#成员]
     */
    public static String[] deployServer(String[] graphContent)
    {
    	
        /**do your work here**/
    	//将无向图按有向图存入集合
    	com.cacheserverdeploy.deploy.graphInCollection.MainClass.mainClass(graphContent);
    	
    	//TODO 用dijkstra算法获得每个consumer的可达netNode
    	
    	
    	//TODO 在所有netNode上遍历布置Server，用多源多汇最小费用流求结果
    	
    	return new String[]{"17","\r\n","0 8 0 20"};
    }

}
