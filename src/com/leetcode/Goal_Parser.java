package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class Goal_Parser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
    StringBuilder ans = new StringBuilder();
        char arr [] = command.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'G')
                ans.append('G');
            else if (arr[i] == '(' && arr[i + 1] == ')') {
                ans.append('o');
                i += 1;
            }
            else{
                ans.append("al");
                i += 3;
            }
        }
        return ans.toString();
    }
}
