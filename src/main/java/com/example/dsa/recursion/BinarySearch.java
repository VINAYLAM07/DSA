package com.example.dsa.recursion;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2,4,15,24,25,46,54,56,67,78};
        int ans = search(arr , 4, 0, arr.length-1);
                System.out.println(ans +" : " +arr[ans]);
    }

    private static int search(int[] arr, int target, int start, int end) {
        if(target<arr[start] || target > arr[end]) return -1;

        int mid = start + (end-start)/2;

        if(target==arr[mid]) return mid;

        if(target > arr[mid]) {
            return search(arr, target, mid + 1, end);
        }
        return search(arr, target, start, mid-1);
    }

}
