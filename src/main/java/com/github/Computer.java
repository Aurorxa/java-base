package com.github;

// 模拟电脑类
public class Computer {
    // 模拟插入 USB 设备
    public void plugInUSB(USB device) {
        device.connect();  // 调用设备的 connect 方法
    }

    // 模拟拔出 USB 设备
    public void unplugUSB(USB device) {
        device.disconnect(); // 调用设备的 disconnect 方法
    }
}