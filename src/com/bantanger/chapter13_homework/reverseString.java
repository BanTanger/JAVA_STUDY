package com.bantanger.chapter13_homework;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class reverseString {
    public static void main(String[] args) {
        String str = "abcdef";
        String reverse = null;
        try {
            reverse = reverse(str, 1, 6);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } // 异常情况处理 增强健壮性
        System.out.println(reverse);
    }
    public static String reverse(String str,int start,int end){
        // 传入参数进行验证
        if(!(str != null && start != 0 && start < end && end < str.length())){
            throw new RuntimeException("参数不对");
        }
        // 先转换成char类型
        char[] chars = str.toCharArray();
        char temp = ' ';
        while(start <= end){
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
