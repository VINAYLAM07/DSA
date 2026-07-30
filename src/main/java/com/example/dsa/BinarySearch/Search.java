package com.example.dsa.BinarySearch;

public class Search {

    public static void main(String[] args) {
        System.out.println(search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));

    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
