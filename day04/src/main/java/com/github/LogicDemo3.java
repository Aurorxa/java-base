package com.github;

public class LogicDemo3 {
    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        // 短路现象：在逻辑或 (||) 运算符中，左侧条件为 true 时，右侧条件不会被计算
        if (i != 0 || j++ > 0) {
            System.out.println("床前明月光"); // 这行代码会被执行
        } else {
            System.out.println("我叫郭德纲"); // 这行代码不会被执行
        }

        // 输出 j 的值
        System.out.println(j); // 10
    }
}
