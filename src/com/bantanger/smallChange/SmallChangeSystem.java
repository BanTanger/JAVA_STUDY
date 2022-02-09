package com.bantanger.smallChange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    public static void main(String[] args) {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        double money = 0;
        double balance = 0;
        Date date = null; // date 是 java.util.Date 类型 表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "-------------------零钱通明细-------------------";

        // 消费
        String note = "";

        do {
            System.out.println("\n===================零钱通菜单=================");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择(1-4):");
            key = scanner.next();
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    // money 值应该校验
                    if(money <= 0){
                        System.out.println("收益入账金额 需要 大于 0");
                    }
                    balance += money;
                    // 拼接信息到details里
                    date = new Date();// 获取当前时间
                    System.out.println(sdf.format(date));
                    details += "\n收益入账\t+"+money+"\t"+ sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    if(money <= 0|| money > balance){
                        System.out.println("消费金额 输入 不对");
                    }
                    System.out.println("消费说明");
                    note = scanner.next();
                    balance -= money;
                    details += "\n" + note + "\t\t-"+money+"\t"+sdf.format(date)+"\t"+balance;
                    break;
                case "4":
                    String choice = "";
                    while(true){
                        System.out.println("确定退出y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)){
                            break;
                        }
                    }
                    if("y".equals(choice)){
                        flag = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，重新输入");
            }
        }while(flag);
    }
}
