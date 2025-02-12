package com.github;

import java.math.BigInteger;

public class IntDemo4 {
    public static void main(String[] args) {

        BigInteger intMin = new BigInteger(String.valueOf(Integer.MIN_VALUE));
        BigInteger intMax = new BigInteger(String.valueOf(Integer.MAX_VALUE));
        // int: [-2147483648 , 2147483647]
        System.out.println("int: [" + intMin + " , " + intMax + "]");

        BigInteger one = new BigInteger(String.valueOf(1));

        // 处理上溢出
        BigInteger newValue = intMax.add(one);
        // newValue = 2147483648
        System.out.println("newValue = " + newValue);

        // 处理上溢出
        newValue = intMin.subtract(one);
        // newValue = -2147483649
        System.out.println("newValue = " + newValue);
    }
}
