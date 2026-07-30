package com.example.dsa.BinarySearch;

public class splitArray {
    public static void main(String[] args) {
        System.out.println(minlargestSum(new int[]{7,2,5,10,8}, 2));
        System.out.println(minlargestSum(new int[]{1,2,3,4,5}, 2));
    }
    public static int minlargestSum(int[] nums, int k){
        int min = 0;
        int max = 0;
        for (int num:nums) {
            min = Math.max(min, num);
            max += num;
        }
        while(min<max){
            int mid = min + (max-min)/2;
            int arrayCount = getArrayCOunt(nums, mid);
            if(arrayCount>k){
                min = mid+1;
            }else{
                max = mid;
            }
        }
        return min;
    }

    private static int getArrayCOunt(int[] nums, int mid) {// {7,2,5,10,8}, 21/15/18/17
        int count =1;
        int subArraySum = 0;
        for (int num : nums){
            if(subArraySum+num >mid){
                count++;
                subArraySum=num;// we are making current num add to new subArraySum
            }else{
                subArraySum +=num;
            }
        }
        return count;
    }
}
