package com.example.dsa.sorting;
//https://leetcode.com/problems/find-the-duplicate-number
//learn about "Tortoise and Hare" or "Floyd’s Cycle"
public class findDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int[] arr1 = {3,1,3,4,2};
        int[] arr2 = {3,3,3,3,3};
        System.out.println(findDuplicate(arr));
        System.out.println(findDuplicate(arr1));
        System.out.println(findDuplicate(arr2));
    }
    public static int findDuplicate(int[] nums){//{1,3,4,2,2}
        int i=0;
        while (i<nums.length){
            if(nums[i] !=i+1){
                int correct = nums[i]-1;
                if(nums[i] == nums[correct]){
                    return nums[i];
                }else{
                    swap(nums, i, correct);
                }
            }else{
                i++;
            }
        }
      return -1;
    }
    private static void swap(int[] nums, int i, int correctIndex) {
        int temp = nums[correctIndex];
        nums[correctIndex] = nums[i];
        nums[i] = temp;
    }
}
