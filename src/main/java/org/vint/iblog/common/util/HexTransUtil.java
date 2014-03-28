package org.vint.iblog.common.util;

import java.util.Arrays;

/**
 * 十六进制字符串运算工具
 * Created by Vin on 14-3-27.
 */
public class HexTransUtil {

    static char[] chars =
            {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
             'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd',
             'e', 'f'};


    /**
     * 获取参数序列的下一个序列值
     *
     * @param cSeq  当前序列编号
     * @return 当前序列编号+1
     */
    public String getNextSeq(String cSeq){
        return "";
    }

    public static void main(String[] args) {
        //byte[] bytes = "abc".getBytes();

        //HexTransManager
        //System.out.println(Arrays.toString(bytes));
        //System.out.println(Arrays.binarySearch(chars, 'c'));
        HexTransManager htm = HexTransManager.getInstance("aBE27ccA0");
        long times = System.currentTimeMillis();
        System.out.println("Start: [" + htm.getNext());
        for(int i=0; i< 1000000000; ){
            //System.out.println( ++i + ":" + htm.getNext());
            i++;
            htm.getNext();
        }
        System.out.println("End: [" + htm.getNext());
        System.out.println("cost: " + (System.currentTimeMillis() - times) + " ms");
    }
}
