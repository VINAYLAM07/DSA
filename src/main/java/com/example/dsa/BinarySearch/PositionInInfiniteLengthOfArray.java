package com.example.dsa.BinarySearch;

public class PositionInInfiniteLengthOfArray {
    public static void main(String[] args) {
        System.out.println(ans(new int[]{-74,-25,-6,-1,0,2,6,24,35,65,78,97,145,151},97));
    }
    private static int findelementInaarr(int[] arr, int t, int start, int end) {
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]< t){
                start = mid+1;
            }else if (arr[mid]> t){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int ans(int[] arr, int t){
        int start = 0;
        int end = 1;
        while(t > arr[end]){
            int newStart = end+1;
            end = end + (end - start+1)*2;
            start = newStart;
        }
        return findelementInaarr(arr,t, start, end) ;
    }
}
