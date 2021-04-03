package com.leetcode;
import java.util.*;

public class Maximum_69_Number_1323 {
    public static void main(String[] args) {
        System.out.println(maximum69Number(99669));
    }
    public static int maximum69Number (int num) {
        List<Integer> al = new ArrayList<>();
        StringBuilder as = new StringBuilder();
        while (num != 0){
            int digit = num % 10;
            num /= 10;
            al.add(digit);
        }
        Collections.reverse(al);
        al.set(al.indexOf(6), 9);
        for(Integer a:al)
            as.append(a);
        return Integer.parseInt(as.toString());
    }
}
