package com.github;

public class ArithmeticDemo4 {
    public static void main(String[] args) {
        int i1 = 10, i2 = 20;
        int i = i1++; // 后缀自增
        System.out.println("i = " + i); // i = 10
        System.out.println("i1 = " + i1); // i1 = 11

        i = ++i1; // 前缀自增
        System.out.println("i = " + i); // i = 12
        System.out.println("i1 = " + i1); // i1 = 12

        i = i2--; // 后缀自减
        System.out.println("i = " + i); // i = 20
        System.out.println("i2 = " + i2); // i2 = 19

        i = --i2; // 前缀自减
        System.out.println("i = " + i); // i = 18
        System.out.println("i2 = " + i2); // i2 = 18
    }
}
