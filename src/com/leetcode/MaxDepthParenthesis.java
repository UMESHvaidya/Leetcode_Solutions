package com.leetcode;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MaxDepthParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String query = sc.next();
        System.out.println(maxDepth(query));
    }
    public static int maxDepth(String s) {
//        char arr[] = s.toCharArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        int maxi = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(stack.peek() + 1);
                if (stack.peek() > maxi)
                    maxi = stack.peek();
            }
            else if(s.charAt(i) == ')')
                stack.push(stack.peek() - 1);
        }
        return maxi;
    }
}
