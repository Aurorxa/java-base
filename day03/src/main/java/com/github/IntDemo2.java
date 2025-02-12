package com.github;

public class IntDemo2 {
    public static void main(String[] args) {

        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        // byte: [-128 , 127]
        System.out.println("byte: [" + byteMin + " , " + byteMax + "]");

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        // short: [-32768 , 32767]
        System.out.println("short: [" + shortMin + " , " + shortMax + "]");

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;
        // int: [-2147483648 , 2147483647]
        System.out.println("int: [" + intMin + " , " + intMax + "]");

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        // long: [-9223372036854775808 , 9223372036854775807]
        System.out.println("long: [" + longMin + " , " + longMax + "]");
    }
}
