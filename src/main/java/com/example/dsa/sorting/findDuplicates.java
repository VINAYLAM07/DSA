package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/// https://leetcode.com/problems/find-all-duplicates-in-an-array/
public class findDuplicates {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr1 = {1, 1, 2};
        int[] arr2 = {1};
        System.out.println(findAllDuplicates(arr));
        System.out.println(findAllDuplicates(arr1));
        System.out.println(findAllDuplicates(arr2));
    }

    public static List<Integer> findAllDuplicates(int[] nums) {//{4,3,2,7,8,2,3,1}
        List<Integer> arr = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                   i++;
                }
            } else {
                i++;
            }
        }
        for (int j=0;j<nums.length;j++){
            if((nums[j] != j+1)){
                arr.add(nums[j]);
            }
        }

        return arr;
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }
}
