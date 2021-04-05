package com.leetcode;

import java.util.Scanner;

public class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] ans;
        for (int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        ans = replaceElements(arr);
        for(int a:ans)
            System.out.print(a+" ");
        System.out.println();
    }
    public static int[] replaceElements(int[] arr) {
        int brr[] = new int[arr.length]; int max_till_now = arr[arr.length -1];
        brr[arr.length -1] = -1;
        for(int i = arr.length-2; i >= 0; --i){
            brr[i] = max_till_now;
            max_till_now = Math.max(max_till_now, arr[i]);
        }
        return brr;
    }
}
