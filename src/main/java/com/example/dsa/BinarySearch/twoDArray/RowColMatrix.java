package com.example.dsa.BinarySearch.twoDArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][]  matrix = {{1,3,5,7},
                          {10,11,16,20},
                          {23,30,34,60},
                          {62,67,83,88}};
        int target = 16;
        System.out.println(Arrays.toString(search(matrix,target)));
    }
    static int[] search(int[][] arr, int target){
        int startRow = 0;
        int endRow = arr.length-1;//row
        while(startRow<=endRow){
            if (startRow==endRow){
                return searchRow(arr, endRow, target);
            }
            int midRow = startRow + (endRow-startRow)/2;
            if(target< arr[midRow][0]){
                endRow = midRow-1;
            }else if (target > arr[midRow][0]) {
                if(target > arr[midRow][arr[midRow].length-1]){
                    startRow = midRow+1;
                }else{
                    startRow = midRow;
                    endRow = midRow;
                }
            }
        }
        return null;
    }

    private static int[] searchRow(int[][] arr, int row, int target) {//{10,11,16,20}, 1, 16
        int start =0;
        int end = arr[row].length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[row][mid]<target){
                start = mid+1;
            } else if (arr[row][mid]>target) {
                end = mid;
            }else{
                return new int[]{row, mid};
            }
        }
        return null;
    }
}
