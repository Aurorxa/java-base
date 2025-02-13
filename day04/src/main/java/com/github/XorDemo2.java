package com.github;

public class XorDemo2 {
    /**
     * 判断一个非 0 的整数是否是 2 的幂
     */
    public static boolean isPowOfTwo(int num) {
        if (num <= 0) {
            return false;
        }

        return (num & (num - 1)) == 0; // [!code highlight]
    }

    public static void main(String[] args) {

        int num = 1;
        // 1 是 2 的幂：true
        System.out.println(num + " 是 2 的幂：" + isPowOfTwo(num));

        num = 2;
        // 2 是 2 的幂：true
        System.out.println(num + " 是 2 的幂：" + isPowOfTwo(num));

        num = 3;
        // 3 不是 2 的幂：false
        System.out.println(num + " 是 2 的幂：" + isPowOfTwo(num));

        num = 4;
        // 4 是 2 的幂：true
        System.out.println(num + " 是 2 的幂：" + isPowOfTwo(num));
    }
}
