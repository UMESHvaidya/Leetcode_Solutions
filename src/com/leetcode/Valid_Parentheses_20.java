package com.leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        System.out.println(isValid(command));
    }
    public static boolean isValid(String expression){
        ArrayDeque <Character> stack = new ArrayDeque<>();
        Map<Character, Character> parenthesis = new HashMap<>();
        parenthesis.put('(',')');
        parenthesis.put('{','}');
        parenthesis.put('[',']');
        for(char c:expression.toCharArray()) {
            if ("({[".contains((c + ""))) {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                else if (parenthesis.get(stack.peek()) != c)
                    return false;
                else stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
