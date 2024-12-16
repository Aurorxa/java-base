package com.github;

// 测试类
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        // 创建键盘设备
        USB keyboard = new Keyboard();
        computer.plugInUSB(keyboard);  // 连接键盘
        computer.unplugUSB(keyboard); // 断开键盘

        System.out.println();

        // 创建 U盘设备
        USB flashDrive = new FlashDrive();
        computer.plugInUSB(flashDrive);  // 连接 U盘
        computer.unplugUSB(flashDrive); // 断开 U盘
    }
}