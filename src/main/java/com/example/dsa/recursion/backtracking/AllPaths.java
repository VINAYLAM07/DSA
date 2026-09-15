package com.example.dsa.recursion.backtracking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        printAllPaths(0,0, maze,"", new int[maze.length][maze[0].length],1);

    }

    private static void printAllPaths(int row, int col, boolean[][] way,String s, int[][] path, int count) {
        if(row==way.length-1 && col==way[0].length-1){
            path[row][col] = count;
            for (int[] i : path){
                System.out.println(Arrays.toString(i));
            }
            System.out.println(s);
            return;
        }
        if(!way[row][col]){
            return;
        }
        way[row][col] = false;

        path[row][col] = count;

        if(row < way.length-1){
            printAllPaths(row+1, col, way, s+"D", path, count+1);
        }
        if(col < way[0].length-1){
            printAllPaths(row, col+1, way, s+"R", path, count+1);
        }
        if(row>0){
            printAllPaths(row-1, col, way, s+"U", path, count+1);
        }
        if(col >0){
            printAllPaths(row, col-1, way, s+"L", path, count+1);
        }

        way[row][col] = true;
        path[row][col] = 0;
    }


}
