package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum_69_Number_1323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(maximum69Number(9669));
    }
    public static int maximum69Number (int num) {
        StringBuilder ans = new StringBuilder(); boolean done = false;
        char[] arr = ("" + num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '6' && !done) {
                ans.append('9');
                done = true;
            }else
            ans.append(arr[i]);
        }
        return Integer.parseInt(ans.toString());
    }
}
