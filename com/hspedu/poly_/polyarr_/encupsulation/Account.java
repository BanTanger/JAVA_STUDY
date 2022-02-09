package com.hspedu.encupsulation;
/*
 * 定义两个类，Account and AccountTest 体会封装性
 * Account 要求具有属性：姓名 长度在2-4之间，余额要大于20
 * 密码 必须六位，否则报错 并给出默认值
 * 通过setxxx 来 给Account 属性赋值
 * AccountTest 中测试
 */

public class Account {
    //    为了封装将三个属性设置成私有
    private String name;
    private double balance;
    private String pwd;

    // 构造器设置

    // 无参
    public Account() {
    }

    // 有参 set放在里面 保证验证功能执行
    public Account(String name, double balance, String pwd) {
//        this.name = name;
//        this.balance = balance;
//        this.pwd = pwd;
        setName(name);
        setBalance(balance);
        setPwd(pwd);
    }


//   生成get set 的快捷键是 alt + ins

    public String getName() {
        return name;
    }

    // 姓名长度在2-4；
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("set名字出错，字节长度在2-4范围内");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    // 余额大于20
    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20元");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    // 密码必须6位
    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("error: 密码必须是6位 , 默认密码为000000");
            this.pwd = "000000";
        }
    }
    public void showInfo (){
        System.out.println("账号信息 name=" + name + " 余额" + balance + " 密码" + pwd);
    }
}
