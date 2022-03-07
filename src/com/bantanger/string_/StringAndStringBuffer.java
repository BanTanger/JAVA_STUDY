package com.bantanger.string_;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "jaks";
        StringBuilder stringBuilder = new StringBuilder(str);

        //或者
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1 = stringBuilder1.append(str);
    }
}
