package com.github;

public class ArithmeticDemo1 {
    public static void main(String[] args) {
        int x = 12;
        int x1 = -x, x2 = +x;

        int y = -67;
        int y1 = -y, y2 = +y;

        // 输出结果
        System.out.println("x1=" + x1 + "，x2=" + x2); // x1=-12，x2=12
        System.out.println("y1=" + y1 + "，y2=" + y2); // y1=67，y2=-67
    }
}
