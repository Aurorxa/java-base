package com.github;

public class IntDemo3 {
    public static void main(String[] args) {

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        // int: [-2147483648 , 2147483647]
        System.out.println("int: [" + intMin + " , " + intMax + "]");

        // 上溢出
        intMin = intMax + 1;
        // intMin = -2147483648
        System.out.println("intMin = " + intMin);

        // 下溢出
        intMax = intMin - 1;
        // intMax = 2147483647
        System.out.println("intMax = " + intMax);
    }
}
