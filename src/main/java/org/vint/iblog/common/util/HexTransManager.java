package org.vint.iblog.common.util;

import java.util.Arrays;

/**
 * 16进制序列生成，转换工具
 * Created by Vin on 14-3-27.
 */
public class HexTransManager {

    /*Full shift flag*/
    private boolean fsf = false;

    /*运算位*/
    private int pointer = 0;

    private char[] curHexChars;

//    private char[] chars = {
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//            'A', 'B', 'C', 'D', 'E', 'F', 'a', 'b', 'c', 'd',
//            'e', 'f'
//    };

    private char[] chars = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'
    };

    /*
        私有化构造器，构造这个Manager同意使用getInstance
     */
    @SuppressWarnings("unused")
    private HexTransManager() {
    }

    /**
     * 私有化构造器，构造这个Manager同意使用getInstance
     *
     * @param hexStr 16进制字符串
     */
    private HexTransManager(final String hexStr) {
        validCheck(hexStr);
        this.curHexChars = hexStr.toCharArray();
        pointer = curHexChars.length - 1;
    }

    public static HexTransManager getInstance(String hexStr) {
        return new HexTransManager(hexStr);
    }

    private void validCheck(String hexStr) {
        for (char ch : hexStr.toCharArray()) {
            if (Arrays.binarySearch(chars, ch) < 0) {
                throw new RuntimeException("Unsupported hex string [" + hexStr +
                        "], which should only contains " + Arrays.toString(chars));
            }
        }
    }

    /**
     * 对当前位做增1操作，并设置进位标识和游标位置
     */
    @SuppressWarnings("unused")
    private void doIn() {
        int tmp = Arrays.binarySearch(chars, curHexChars[pointer]),
                ys = (tmp + 1) % chars.length, sh = (tmp + 1) / chars.length;
        if (sh <= 0) {
            curHexChars[pointer--] = chars[ys];
            fsf = false;
        }
        if (sh > 0) {
            curHexChars[pointer--] = chars[ys];
            fsf = true;
        }
    }

    /**
     * 对16进制字符串做自增操作，每调用一次增加1.
     */
    private void increase() {
        fsf = false;
        int tmp = Arrays.binarySearch(chars, curHexChars[pointer]),
                ys = (tmp + 1) % chars.length, sh = (tmp + 1) / chars.length;
        curHexChars[pointer--] = chars[ys];
        if (sh > 0) fsf = true;
        if (fsf && pointer >= 0) increase();
    }

    /**
     * 获取下一个16进制序列字符串
     *
     * @return 16进制序列
     */
    public String getNext() {
        // reset pointer
        pointer = curHexChars.length - 1;
        // call increase
        increase();
        return new String(curHexChars);
    }


    /**
     * 获取最后一个序列
     *
     * @return the last number
     */
    public String getCurSeq(){
        return new String(curHexChars);
    }
}
