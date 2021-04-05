package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String test = sc.next();
        System.out.println(halvesAreAlike(test));
    }
    public static boolean halvesAreAlike(String s) {
        String s1 = s.substring(0, s.length() / 2);
        String s2 = s.substring(s.length() / 2);
        int ans1 = getVowelCount(s1);
        int ans2 = getVowelCount(s2);
        return ans1 == ans2;
    }
    public static int getVowelCount(String s)
    {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        int max = 0;
        for (Map.Entry<Character,Integer> entry : map.entrySet())
            max += entry.getValue();

        return max;
    }
}

