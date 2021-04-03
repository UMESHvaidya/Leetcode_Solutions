package com.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

//import static java.lang.System.*;

public class Count_Consistent_Strings_1684 {
    public static void main(String[] args) {
        String allowed = "abc";
        String[]words = {"a","b","c","ab","ac","bc","abcd"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int res = words.length;
        int k [] = new int[123];
        for(int i =0;i<allowed.length();i++)
            k[(int)allowed.charAt(i)]=1;
        for (String s : words) {
            if (IntStream.range(0, s.length()).anyMatch(j -> k[(int) s.charAt(j)] != 1)) {
                res--;
            }
        }
        return res;
    }
}
