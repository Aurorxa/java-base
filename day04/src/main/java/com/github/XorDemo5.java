package com.github;

public class XorDemo5 {
    /**
     * 任何数与 0 异或等于其本身，任何数与其自身异或等于 0。
     * 因此，数组中成对出现的数字将通过异或运算抵消为 0，
     * 最终剩下的结果就是唯一出现一次的数字。
     *
     * @param arr
     * @param len
     * @return
     */
    public static int findOnly(int[] arr, int len) {
        int singleNum = 0;

        for (int i = 0; i < len; ++i) {
            singleNum ^= arr[i];
        }

        return singleNum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 1, 2};

        int num = findOnly(nums, nums.length);

        System.out.println(num); // 4
    }
}
