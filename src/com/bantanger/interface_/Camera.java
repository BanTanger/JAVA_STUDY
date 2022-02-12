package com.bantanger.interface_;

public class Camera implements Usbinterface{
    @Override
    public void start() {
        System.out.println("摄像机开始工作---");
    }

    @Override
    public void end() {
        System.out.println("摄像机停止工作---");
    }
}
