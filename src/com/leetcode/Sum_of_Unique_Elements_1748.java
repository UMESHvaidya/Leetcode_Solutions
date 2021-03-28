package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sum_of_Unique_Elements_1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
    public static int sumOfUnique(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int a:nums){
            if (mp.containsKey(a))
                mp.put(a,mp.get(a) + 1);
            else mp.put(a,1);
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue() == 1)
                ans += entry.getKey();
        }
        return ans;
    }
}
