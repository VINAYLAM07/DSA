package com.example.dsa.recursion.Array;

import java.util.*;
class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,2,4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3,3}, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for(int n=0;n<nums.length;n++){
            int reqN = target-nums[n];
            if(m.containsKey(reqN)){
                ans[0] = m.get(reqN);
                ans[1] = n;
            }
            m.put(nums[n], n );
        }
        return ans;
    }
}