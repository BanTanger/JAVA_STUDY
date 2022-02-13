package com.bantanger.exception_;

import java.util.Scanner;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true){
            System.out.println("输入一个整数");
            try {
                Integer.parseInt(scanner.next());
                break;// 如果不能转成整数，那说明不是整数
                // 只有整数才能转成整数？
            } catch (NumberFormatException e) {
                System.out.println("输入的不是一个整数");
            }
        }
    }
}
