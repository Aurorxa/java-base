package com.github;

public class XorDemo6 {
    /**
     * 要找出一个不为 0 的整数值为 1 的最低有效位
     * @param num
     * @return
     */
    public static int findLowestSetBit(int num) {
        return num & -num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 2, 5};

        int len = nums.length;

        int xor = 0;
        for (int i = 0; i < len; ++i) {
            xor ^= nums[i];
        }

        // xor = a ^ b
        System.out.println("xor = " + xor);

        // a 和 b 在这一位上是不同的
        int lsb = findLowestSetBit(xor);

        System.out.println("lsb = " + lsb);

        // 根据这一位将所有元素分类
        int a = 0, b = 0;
        for (int i = 0; i < len; ++i) {
            if ((nums[i] & lsb) != 0) { // 1
                a ^= nums[i];
            } else { // 0
                b ^= nums[i];
            }
        }

        // a = 3, b = 5
        System.out.println("a = " + a + ", b = " + b);
    }
}
