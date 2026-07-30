package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] nums) {
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
        System.out.println(Arrays.toString(nums));
        int[] arr = new int[2];
        for(int j=0; j<nums.length;j++){
            if((nums[j] != j+1)){
                arr[0] = j;
                arr[1] = j+1;
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