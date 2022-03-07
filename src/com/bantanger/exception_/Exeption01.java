package com.bantanger.exception_;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class Exeption01 {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        // 代码块选中 快捷键 ctrl + alt + t -> 选中 try-catch
        try {
            int res = x / y;
        } catch (Exception e) {
            // e.printStackTrace();
            // 将错误信息打印
            System.out.println("出现异常信息的原因= " + e.getMessage());
        }
        System.out.println("==============");
        System.out.println("程序处理异常成功");
    }
}
