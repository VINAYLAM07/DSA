package com.example.dsa.BinarySearch.twoDArray;

public class RowColMatrixFind {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60},
                {62, 67, 83, 88}};
        int target = 87;
        System.out.println(search(matrix, target));
    }
    static boolean search(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int startRow = 0;
        int endRow = matrix.length - 1;//row
        while (startRow <= endRow) {

            int midRow = startRow + (endRow - startRow) / 2;
            if (target < matrix[midRow][0]) {
                endRow = midRow - 1;
            } else if (target >= matrix[midRow][0]) {
                if (target > matrix[midRow][matrix[midRow].length - 1]) {
                    startRow = midRow + 1;
                } else {
                    return searchRow(matrix, midRow, target);
                }
            }
        }
        return false;
    }

    private static boolean searchRow(int[][] arr, int row, int target) {
        int start = 0;
        int end = arr[row].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[row][mid] == target) {// always write matching case first
                return true;
            } else if (arr[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
