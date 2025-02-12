package com.github;

public class IntDemo5 {
    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;
        int one = 1;

        try {
            int result = Math.addExact(max, one);
            System.out.println("result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("上溢出：" + e.getMessage());
        }
    }
}
