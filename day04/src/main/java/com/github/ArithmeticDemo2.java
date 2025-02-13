package com.github;

public class ArithmeticDemo2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // 输出加法结果
        System.out.println(a + " + " + b + " = " + (a + b)); // 5 + 2 = 7
        // 输出减法结果
        System.out.println(a + " - " + b + " = " + (a - b)); // 5 - 2 = 3
        // 输出乘法结果
        System.out.println(a + " × " + b + " = " + (a * b)); // 5 × 2 = 10
        // 输出除法结果（注意：在 Java 中，整数相除会得到整数结果）
        System.out.println(a + " / " + b + " = " + (a / b)); // 5 / 2 = 2
        // 输出取余（模）结果
        System.out.println(a + " % " + b + " = " + (a % b)); // 5 % 2 = 1
    }
}
