package com.example.dsa.BinarySearch.twoDArray;

public class RowColMatrixFinal {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
                {62, 67, 83, 88}};
        int target = 87;
        System.out.println(search(matrix, target));
    }

    static boolean search(int[][] arr, int target) {
        if (arr.length == 0) return false;

        int rows = arr.length;
        int cols = arr[0].length;

        int start = 0;
        int end = (rows * cols) - 1; // Treat as a 1D array

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Convert 1D mid back to 2D row and column
            int r = mid / cols;
            int c = mid % cols;

            if (arr[r][c] == target) {
                return true;
            } else if (arr[r][c] < target) {
                start = mid + 1;
            } else {
                end = mid - 1; // Use mid - 1 to avoid infinite loops!
            }
        }
        return false;
    }
}

