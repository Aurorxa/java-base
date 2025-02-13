package com.github;

/**
 * 取模（运算结果的符号与被模数，也就是第一个操作数相同）
 */
public class ArithmeticDemo3 {
    public static void main(String[] args) {
        int res1 = 10 % 3;
        System.out.println("10 % 3 = " + res1); // 10 % 3 = 1

        int res2 = -10 % 3;
        System.out.println("-10 % 3 = " + res2); // -10 % 3 = -1

        int res3 = 10 % -3;
        System.out.println("10 % -3 = " + res3); // 10 % -3 = 1

        int res4 = -10 % -3;
        System.out.println("-10 % -3 = " + res4); // -10 % -3 = -1
    }
}
