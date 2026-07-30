package com.example.dsa.BinarySearch.twoDArray;

import java.util.Arrays;

public class RowColMatrix2 {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(search(arr, 49)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {//Until row is under matrix length( we increase row while searching) && Until column greater than 0 ( we decrease col while searching)
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {//if the current value is less than target --> increase row
                r++;
            } else {//if the current value is greater than target --> decrease column
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
