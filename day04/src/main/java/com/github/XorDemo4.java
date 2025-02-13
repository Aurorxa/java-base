package com.github;

public class XorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // a = 10, b = 20
        System.out.println("a = " + a + ", b = " + b);

        // 使用异或交换 a 和 b 的值
        a = a ^ b; // a = a0 ^ b0
        b = a ^ b; // b = a0 ^ b0 ^ b0 = a0
        a = a ^ b; // a = a0 ^ b0 ^ a0 = b0

        // a = 20, b = 10
        System.out.println("a = " + a + ", b = " + b);
    }
}
