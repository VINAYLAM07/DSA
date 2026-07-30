package com.example.dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CycleSort {
    public static void main(String[] args) {
//        int[] arr = {3, 0, 5, 1, 2, 6, 4};
//        int[] arr1 = {5, 4, 3, 2, 1};
//        int[] nums = {3, 0, 1};
//        int[] nums = {9,6,4,2,3,5,7,0,1};
//        int[] nums = {0,3,5,8,4,6,1,9,7};
        int[] nums = {4,3,2,7,8,2,3,1};
        int[] nums3 = {1,1};
//        cycleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        cycleSort(arr1);
//        System.out.println(Arrays.toString(arr1));
          System.out.println(findMissingNumber2(nums));
        System.out.println(findMissingNumber2(nums3));
    }
    private static int findMissingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctIndex = nums[i];
            if((nums[i]< nums.length) && (nums[i] != nums[correctIndex])){
                swap(nums, i, correctIndex);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return findMissMatchedIndex(nums);
    }
    private static List<Integer> findMissingNumber2(int[] nums) {//{4,3,2,7,8,2,3,1}
        int i=0;
        while(i<nums.length){
            int value = nums[i];
            if (value>=1 && value<=nums.length) {
                int correctIndex = nums[i];
                if(nums[i] != nums[correctIndex-1]){
                    swap(nums, i, correctIndex-1);
                }else{
                    i++;
                }
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return findMissMatchedIndexes(nums);
    }

    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }

    private static int findMissMatchedIndex(int[] arr2) {
        int endIndex = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == i) {
                endIndex=i;
            } else {
                return i;
            }
        }
        return endIndex+1;
    }
    private static List<Integer> findMissMatchedIndexes(int[] arr2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == i+1) {
                continue;
            } else {
                list.add(i+1);
            }
        }
        return list;
    }

    private static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                int currentValue = arr[i];
                arr[i] = arr[currentValue - 1];
                arr[currentValue - 1] = currentValue;
            } else {
                continue;
            }
        }
    }
}
