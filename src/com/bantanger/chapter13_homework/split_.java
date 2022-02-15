package com.bantanger.chapter13_homework;

import java.util.Locale;

/**
 * @author bantanger 半糖
 * @version 1.0
 */
public class split_ {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        String[] s = name.split(" ");
        char i = s[1].toUpperCase().charAt(0);
        System.out.println(s[s.length - 1] + "," + s[0] + "." + i);
    }
}
