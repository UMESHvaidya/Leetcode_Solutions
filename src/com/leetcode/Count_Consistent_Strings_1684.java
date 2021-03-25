package com.leetcode;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Count_Consistent_Strings_1684 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String allowed = "abc";
        String[]words = {"a","b","c","ab","ac","bc","abcd"};
        System.out.println(countConsistentStrings(allowed,words));
    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        Integer arr[] = new Integer[allowed.length()];
        for (int i = 0; i < arr.length; i++)
                arr[i] = (int)allowed.charAt(i);
        Set<Integer> mySet = new HashSet<>();
        Collections.addAll(mySet,arr);
        for (int i = 0; i < words.length; i++) {
            Integer brr[] = new Integer[words[i].length()];
            for (int j = 0; j < brr.length; j++) {
                brr[j] = (int) words[i].charAt(j);
            }
            Set<Integer> mySet_2 = new HashSet<>();
            Collections.addAll(mySet_2,brr);
            Set<Integer> result = new HashSet<>(mySet);
            result.addAll(mySet_2);
            if(mySet.equals(result)) ans+= 1;

        }
        return ans;
    }
}
