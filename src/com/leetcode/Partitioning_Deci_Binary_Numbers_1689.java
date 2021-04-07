package com.leetcode;

import java.util.Scanner;

public class Partitioning_Deci_Binary_Numbers_1689 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = sc.next();
        System.out.println(minPartitions(query));
    }
    public static int minPartitions(String n) {
        int max = -1;
        for(char c:n.toCharArray()){
            int y = c - '0';
            if(y > max) max = y;
        }
        return max;
    }
}
