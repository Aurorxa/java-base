package com.github.day02;

/**
 *
 * 使用变量表示一个人的信息，如：姓名、年龄、性别、身高、体重等。
 */
public class Exec1 {
    public static void main(String[] args) {

        // 姓名
        String name = "张三";

        // 年龄
        int age = 18;

        // 性别
        char gender = '男';

        // 身高
        double height = 1.75;

        // 体重
        double weight = 80.0;

        System.out.println("姓名：" + name); // 姓名：张三
        System.out.println("年龄：" + age); // 年龄：18
        System.out.println("性别：" + gender); // 性别：男
        System.out.println("身高：" + height); // 身高：1.75
        System.out.println("体重：" + weight); // 体重：80.0
    }
}
