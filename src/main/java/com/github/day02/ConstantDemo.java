package com.github.day02;

public class ConstantDemo {
    public static void main(String[] args) {

        // ① 字符串常量
        System.out.println("HelloWorld"); // 普通字符串
        System.out.println("a"); // 只包含一个字符的字符串
        System.out.println(""); // 空字符串

        // 字符常量
        System.out.println('a'); // 字符
        System.out.println('许'); // 字符
        System.out.println('大'); // 字符
        System.out.println('仙'); // 字符

        // 整数常量
        System.out.println(12); // 普通整数：正数
        System.out.println(-12); // 普通整数：负数
        System.out.println(220000000000000000L); // 整数常量默认是int类型，如果超过这个范围，需要加 L，转换为long类型

        // 布尔类型常量
        System.out.println(true);
        System.out.println(false);

        // 浮点类型常量
        System.out.println(3.14F); // 单精度浮点类型常量
        System.out.println(3.14); // 双精度浮点类型常量，可以加d或D，如果不写，默认就是双精度浮点类型常量

    }
}
