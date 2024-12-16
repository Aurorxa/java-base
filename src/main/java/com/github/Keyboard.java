package com.github;

// 实现 USB 接口：键盘
public class Keyboard implements USB {
    @Override
    public void connect() {
        System.out.println("Keyboard connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("Keyboard disconnected.");
    }
}