package com.example.dsa.LinearSearch;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForElement(new int[]{23, 45, 76, 12, 8, 12, 78},8));
        System.out.println(checkForElement(new int[]{},8));
    }
    static int checkForElement(int[] arr, int target){
        if(arr.length == 0 ) return -1;

        for(int i=0; i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
