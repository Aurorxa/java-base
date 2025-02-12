package com.github;

public class BaseDemo2 {

    public static void main(String[] args) {

        int num = 10;

        // 10 对应的二进制是：1010
        System.out.println(num + " 对应的二进制是：" + Integer.toBinaryString(num));
        // 10 对应的八进制是：12
        System.out.println(num + " 对应的八进制是：" + Integer.toOctalString(num));
        // 10 对应的十六进制是：a
        System.out.println(num + " 对应的十六进制是：" + Integer.toHexString(num));

        // 10 对应的二进制是： 0b1010
        System.out.printf(num + " 对应的二进制是： 0b%s\n", Integer.toBinaryString(num));
        // 10 对应的八进制是： 012
        System.out.printf(num + " 对应的八进制是： 0%s\n", Integer.toOctalString(num));
        // 10 对应的十六进制是： 0xa
        System.out.printf(num + " 对应的十六进制是： 0x%s\n", Integer.toHexString(num));
    }
}
