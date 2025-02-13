package com.github;

public class ThreeDemo {
    public static void main(String[] args) {
        int m = 110;
        int n = 20;
        int max = m >= n ? m : n;

        // 110 和 20 中的最大值是：110
        System.out.println(m + " 和 " + n + " 中的最大值是：" + max);
    }
}
