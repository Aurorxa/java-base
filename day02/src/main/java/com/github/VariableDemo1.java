package com.github;

public class VariableDemo1 {
    public static void main(String[] args) {

        // 声明一个变量，名称是 age，其数据类型是 int
        int age;
        // 声明一个变量，名称是 name，其数据类型是 String
        String name;
        // 声明一个变量，名称是 salary，其数据类型是 double
        double salary;

        // 给变量 age 赋值 10
        age = 10;
        // 给变量 name 赋值 "张三"
        name = "张三";
        // 给变量 salary 赋值 100
        salary = 10000.0;

        // 输出变量 name 的值
        System.out.println("姓名是：" + name);
        // 输出变量 age 的值
        System.out.println("年龄是：" + age);
        // 输出变量 salary 的值
        System.out.println("工资是：" + salary);
    }
}
