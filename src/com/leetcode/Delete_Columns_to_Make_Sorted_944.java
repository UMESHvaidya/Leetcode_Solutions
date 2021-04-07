package com.leetcode;

import java.util.Scanner;

public class Delete_Columns_to_Make_Sorted_944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for (int i = 0; i <size; i++)
            arr[i] = sc.next();
        System.out.println(minDeletionSize(arr));

    }
    public static int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i = 0; i < strs[0].length(); i++)
            for(int j = 0; j < strs.length-1; j++)
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    count++;
                    break;
                }
        return count;
    }
}
