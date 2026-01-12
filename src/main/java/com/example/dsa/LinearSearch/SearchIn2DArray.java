package com.example.dsa.LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        System.out.println("Min: "+findMin(new int[][]{{23,4,67},{78,-9,11,45},{55}}));
        System.out.println("Max: "+findMax(new int[][]{{23,4,67},{78,-9,11,45},{55}}));
        System.out.println(SearchForTarget(new int[][]{{23,4,67},{78,-9,11,45},{55}}, 55));
        System.out.println(Arrays.toString(SearchForTarget2(new int[][]{{23,4,67},{78,-9,11,45},{55}}, 55)));
    }

    private static int findMax(int[][] ints) {
        int max = Integer.MIN_VALUE;
        for (int[] i : ints) {
            for (int j : i) {
                if(j>max){
                    max = j;
                }
            }
        }
        return max;
    }

    private static String SearchForTarget(int[][] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] == target) {
                    System.out.println("Found !!");
                    return "["+i+","+j+"]";
                }
            }
        }
        return "Not Found !!";
    }
    private static int[] SearchForTarget2(int[][] ints, int target) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if (ints[i][j] == target) {
                    System.out.println("Found !!");
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int findMin(int[][] arr2D){
        int min = Integer.MAX_VALUE;
        for (int[] i : arr2D) {
            for (int j : i) {
                if(j<min){
                    min = j;
                }
            }
        }
        return min;
    }
}
