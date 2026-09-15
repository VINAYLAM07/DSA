package com.example.dsa.recursion.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maize {
    public static void main(String[] args) {
//        System.out.println(countWays(3,3));
//        printWay(3,3, "");
//        printWayDiagonal(3,3, "");
        boolean[][] way = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        printWayWithObstrucle(0,0,way,"");
    }

    private static void printWayWithObstrucle(int row, int col, boolean[][] way, String s) {
        if(row==way.length-1 && col==way[0].length-1){
            System.out.println(s);
        }
        if(!way[row][col]){
            return;
        }
        if(row < way.length-1){
            printWayWithObstrucle(row+1, col, way, s+"R");
        }
        if(col < way[0].length-1){
            printWayWithObstrucle(row, col+1, way, s+"D");
        }
    }

    private static void printWayDiagonal(int row, int col, String way) {
        if (row == 1 && col == 1) {
            System.out.println(way);
        }
        if (row > 1 && col>1) {
            printWayDiagonal(row - 1, col-1, way + "X");
        }
        if (row > 1) {
            printWayDiagonal(row - 1, col, way + "D");
        }
        if (col > 1) {
            printWayDiagonal(row , col-1, way + "R");
        }
    }

    private static int countWays(int row, int col) {
        List<String> li = new ArrayList<>();
        if(row==1 || col==1){
            return 1;
        }
        int right = countWays(row,col-1);
        int down = countWays(row-1, col);

        return right+down;
    }
    private static void  printWay(int row, int col, String way) {
        if(row==1 && col==1){
            System.out.println(way);
        }
        if(col>1){
            printWay(row,col-1, way+"R");
        }
        if(row>1){
            printWay(row-1, col, way+"D");
        }
    }
}
