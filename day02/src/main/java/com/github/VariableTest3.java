package com.github;

import java.util.Scanner;

public class VariableTest3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个整数：");
        int num = scanner.nextInt();
        int original = num;
        int rev = 0;

        // 从右边开始，依次获取每个数字，然后拼接到 rev 中
        // 循环结束的条件是 num == 0
        while (num != 0) {
            // 获取 num 右边的第一位数字
            int temp = num % 10;
            // 去掉最后一位数字
            num /= 10;
            // 将 temp 拼接到 rev 的后面
            rev = rev * 10 + temp;
        }

        // 输出反转结果
        System.out.println(original + " 的反转是 " + rev);

        scanner.close();
    }
}