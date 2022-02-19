package com.bantanger.drawcircle_;

import javax.swing.*;
import java.awt.*;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class DrawCircle extends JFrame {

    // 定义面板
    private Mypanel mp = null;

    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() { // 构造器
        // 初始化面板
        mp = new Mypanel();
        // 把面板放到窗口
        this.add(mp);
        this.setSize(400, 300);
        this.setVisible(true); // 设置可视
        // 点击 × 关闭
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}

// Mypanel 画板
class Mypanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);// 调用父类方法完成初始化
        // 画一个圆形
        g.drawOval(10, 10, 100, 100);
    }
}
