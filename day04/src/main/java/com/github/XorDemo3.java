package com.github;

public class XorDemo3 {
    /**
     * 要找出一个不为 0 的整数值为 1 的最低有效位
     */
    public static int findLowestSetBit(int num) {
        return num & -num; // [!code highlight]
    }

    public static void main(String[] args) {
        int num = 24;

        // 24 的最低有效位是：8
        System.out.println("24 的最低有效位是：" + findLowestSetBit(num));
    }
}
