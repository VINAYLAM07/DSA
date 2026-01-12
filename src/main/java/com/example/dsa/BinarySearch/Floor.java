package com.example.dsa.BinarySearch;

public class Floor {//Greatest number which is less than or equal to target
    public static void main(String[] args) {
        int[] arr = {-74,-25,-6,-1,0,2,6,24,35,65,78,97,145,151};
        System.out.println(Search(arr, 36));
        System.out.println(Search(arr, 97));
        System.out.println(Search(arr, 100));
    }

    private static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        if(target>arr[arr.length-1]) return arr[arr.length-1];
        if(target<arr[start]) return -1;
        while (start<=end){
            int mid = (start)+ (end-start)/2;
            if(target> arr[mid]){
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }else return arr[mid];
        }
        return arr[end];
    }
}
