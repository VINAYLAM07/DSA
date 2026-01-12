package com.example.dsa.BinarySearch;

public class BinaySearch {
    public static void main(String[] args) {
        int[] arr = {-74,-25,-6,-1,0,2,6,24,35,65,48,97,145,151};
        System.out.println(Search(arr, 35));
    }

    private static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = (start)+ (end-start)/2;
            if(target> arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else return mid;
        }
        return -1;
    }
}
