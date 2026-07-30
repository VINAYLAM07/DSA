package com.example.dsa.BinarySearch;

public class RotationCount {

    public static void main(String[] args) {
        System.out.println(findRotationCount(new int[] {4,5,6,7,0,1,2}));
        System.out.println(findRotationCount(new int[] {6,7,0,1,2}));
        System.out.println(findRotationCount(new int[] {2}));
        System.out.println(findRotationCount(new int[] {3,2}));
        System.out.println(findRotationCount(new int[] {1,2,3,4,5}));
    }

    private static int findRotationCount(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        if(nums.length==1) return start;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid< end && nums[mid] > nums[mid+1]){
                return mid+1;
            }
            if(start<mid && nums[mid]< nums[mid-1]) {
                return mid;
            }
            if(nums[mid]<=nums[start]) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return 0;
    }

}
