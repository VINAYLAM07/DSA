package com.example.dsa.LinearSearch;

public class FindMinimum {

    public static void main(String[] args) {

        System.out.println(findMin(new int[]{23,4,-67,78,9,11,45,55}));
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        if(arr.length<=0) return -1;
        for(int i : arr){
            if(i<min){
                min =i;
            }
        }
        return min;
    }
}
