package com.github;

public class ConvertDemo {

    public static void main(String[] args) {

        /*
         * 等号右边的 100 是整数，默认是 int 类型。
         * 等号左边是 long 类型的变量
         *
         * 将取值范围小的数据类型赋值给取值范围大的数据类型,发生了自动类型转换
         */
        long num = 100;

        System.out.println("num = " + num); // num = 100
    }
}
