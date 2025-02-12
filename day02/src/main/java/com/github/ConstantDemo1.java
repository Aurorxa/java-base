package com.github;

/**
 * 整数常量
 */
public class ConstantDemo1 {
    public static void main(String[] args) {

        // 普通整数：正数
        System.out.println(12);
        // 普通整数：负数
        System.out.println(-12);
        // 整数常量默认是 int 类型，如果超过这个范围，需要加 L，转换为 long 类型
        System.out.println(220000000000000000L);
    }
}
