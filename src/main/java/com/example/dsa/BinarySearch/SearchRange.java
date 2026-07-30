package com.example.dsa.BinarySearch;
import java.util.Arrays;
public class SearchRange {
    public static void main(String[] args) {
        int[] result = {-1,-1};
        result[0]= searchRange(new int[] {5,7,7,8,8,8,10}, 8, true);
        if(!(result[0]==-1)){
            result[1] = searchRange(new int[] {5,7,7,8,8,8,10}, 8, false);
        }
//		System.out.println(Arrays.toString(searchRange(new int[] {5,7,7,8,8,10}, 8)) );
        System.out.println(Arrays.toString(result));
    }
    public static int searchRange(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] < target){
                start = mid+1;
            }else if (nums[mid] > target){
                end = mid-1;
            }else{
                index = mid;
                if(isFirst) {
                    end = mid-1;
                }else {
                    start = mid+1;
                }
            }
        }
        return index;
    }
}
