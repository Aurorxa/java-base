package com.github;

// 定义 USB 接口
public interface USB {
    void connect();  // 连接 USB 设备
    void disconnect(); // 断开 USB 设备
}