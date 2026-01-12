package com.example.dsa.BinarySearch;

public class indexOfMountainArray {

    public static void main(String[] args) {
        System.out.println(search(new int[]{0, 3, 5, 9, 12, 25, 67, 68, 71, 79, 66, 54, 32, 3, 111}));
        System.out.println(search(new int[]{1, 2}));
    }
    private static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
                return arr[start];
            }
        }
        return -1;
    }
}