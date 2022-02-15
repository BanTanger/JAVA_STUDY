package com.bantanger.chapter13_homework;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class userRegister {
    public static void main(String[] args) {
        String name = "ba";
        String password = "123456";
        String Mail = "123456.qq@com";
        try {
            userRegister(name,password,Mail);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String password, String Mail) {
        if (!(name.length()<=4 && name.length()>=2)){
            throw new RuntimeException("用户名输入长度应该为2~4个字符");
        }
        if (password.length()!=6){
            throw new RuntimeException("密码长度不对，必须为6位数");
        }
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isDigit(password.charAt(i))){
                throw new RuntimeException("密码必须为全为数字");
            }
        }
        int i = Mail.indexOf('@');
        int j = Mail.indexOf('.');
        if(i == -1 || j == -1 || (i > j)){
            throw new RuntimeException("邮箱中必须包含@和. 并且@在.的前面");
        }
    }
}
