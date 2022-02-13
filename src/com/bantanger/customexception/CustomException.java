package com.bantanger.customexception;

/**
 * @author Bantanger 半糖先生
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 180;
        if (!(age>30 && age < 120)){
            throw new AgeException("年龄需要在30 ~ 120 之间");
        }
        System.out.println("年龄正确");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}

