package com.example.dsa.BinarySearch;

public class searchInInfiniteArray {
    public static void main(String[] args) {
        System.out.println(search(new int[] {-89, -78, -55, -43, -36, -26, -11, -1, 0, 3, 5, 9, 12, 25,67,68,71,79,88,97,156,160 }, 170));
    }
    private static int search(int[] arr, int t) {
        int start = 0;
        int end = 1;
        while(arr[end]< t) {
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
            //Safety check for testing with finite arr
            if(end >= arr.length) {
                end = arr.length-1;
                break;
            }
        }
        return binarySearch(arr, t, start, end );
    }
    private static int binarySearch(int[] arr, int t, int start, int end) {
        while(end >= start) {
            int mid = start + (end-start)/2;
            if(arr[mid]<t) {
                start = mid+1;
            }else if(arr[mid]>t) {
                end = mid-1;
            }else {
                return mid;
            }
        }
        System.out.println("Element not found in the array...");
        return -1;
    }
}