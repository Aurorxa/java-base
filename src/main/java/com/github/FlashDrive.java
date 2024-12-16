package com.github;

// 实现 USB 接口：U盘
public class FlashDrive implements USB {
    @Override
    public void connect() {
        System.out.println("FlashDrive connected.");
    }

    @Override
    public void disconnect() {
        System.out.println("FlashDrive disconnected.");
    }
}