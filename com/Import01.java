package com;

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 7, 45, 20, -16};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
