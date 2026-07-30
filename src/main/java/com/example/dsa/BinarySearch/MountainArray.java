package com.example.dsa.BinarySearch;
public class MountainArray {
    public static void main(String[] args) {
        System.out.println(findPeak(new int[]{1, 2, 3, 4, 5, 6, 4, 3, 2}));
        System.out.println(findPeak(new int[]{1, 2, 1, 3, 5, 6, 4}));
        System.out.println(findPeak(new int[]{1}));//failed - wrote condition
        System.out.println(findPeak(new int[]{1, 2})); //failed
    }
    private static int findPeak (int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (start == end) {// condition moved to up
                return arr[end];
            }
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
//                if (start == end) {
//                    return arr[end];
//                }
            }
        }
        return -1;
    }
}

