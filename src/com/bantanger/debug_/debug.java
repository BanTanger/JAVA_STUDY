package com.bantanger.debug_;

import java.util.Arrays;

public class debug {
    public static void main(String[] args) {
        // 逐行执行
        Debugtest debugtest = new Debugtest();
        debugtest.debug03();
    }
}
class Debugtest{
    public void debug01(){
        int res = 0;
        for (int i = 0; i < 5; i++) {
            res += i;
            System.out.println("i="+i);
            System.out.println("res="+res);
        }
        System.out.println("退出for...");
    }

    public void debug02(){
        int[] arr = {1,2,-1};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出for...");
    }

    public void debug03(){
        int[] arr = {-1,2,4,7,0,-6};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}