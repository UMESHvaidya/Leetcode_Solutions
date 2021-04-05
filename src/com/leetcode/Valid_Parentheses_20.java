package com.leetcode;
import java.util.Scanner;

public class Valid_Parentheses_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.next();
        System.out.println(isValid(command));
    }
    public static boolean isValid(String expression){
        char[] arr = new char[expression.length()];
        int indx = 0;
        for(char c:expression.toCharArray()){
            if (c =='('|| c =='[' || c =='{')
                arr[indx++] = c;
            else{
                if (indx == 0)
                    return false;
                if (c ==')') {
                    if (arr[indx - 1] != '(') return false;
                    else {
                        arr[indx - 1] = 0;
                        indx--;
                    }
                }
                if (c ==']') {
                    if (arr[indx - 1] != '[') return false;
                    else {
                        arr[indx - 1] = 0;
                        indx--;
                    }
                }
                if (c =='}') {
                    if (arr[indx - 1] != '{') return false;
                    else{
                        arr[indx-1] = 0;
                        indx--;
                    }
                }
            }

        }
        return indx ==0;
    }
}
