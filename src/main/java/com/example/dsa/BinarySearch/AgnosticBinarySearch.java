package com.example.dsa.BinarySearch;

public class AgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-74,-25,-6,-1,0,2,6,24,35,65,48,97,145,151};
//                  { 0,  1,  2, 3,4,5,6, 7, 8, 9,10, 11, 12,13};
        int[] arr = {151, 145, 97, 48, 65, 35, 24, 6, 2, 0, -1, -6, -25, -74};
        //           {0,   1,  2,   3,  4,  5,  6, 7, 8, 9, 10, 11,  12,  13};
        System.out.println(Search(arr, 145));
    }
    private static int Search(int[] arr, int target) {
        boolean isAscending = arr[0] < arr[arr.length - 1];
        int index = 0;
        if (isAscending) {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start) + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    index = mid;
                    break;
                }
            }
        } else {
            int start = 0;
            int end = arr.length - 1;
            while (start <= end) {
                int mid = (start) + (end - start) / 2;
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    index= mid;
                    break;
                }
            }
        }
        return index;
    }
}
