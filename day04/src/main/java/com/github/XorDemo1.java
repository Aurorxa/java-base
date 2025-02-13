package com.github;

/**
 * 数学角度
 */
public class XorDemo1 {
    /**
     * 判断一个数是否为奇数
     */
    public static boolean isOdd(int num) {
        return (num & 0x1) == 1;
    }

    public static void main(String[] args) {
        int num = -10;

        // -10 是奇数：false
        System.out.println(num + " 是奇数：" + isOdd(num));

        num = -3;
        // -3 是奇数：true
        System.out.println(num + " 是奇数：" + isOdd(num));
    }
}
