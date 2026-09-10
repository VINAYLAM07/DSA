package com.example.dsa.recursion.Array;

import java.util.Arrays;

public class Sorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1,3,6,24,35,45,66,75,98,100}));
    }

    private static boolean isSorted(int[] ints) {

        return  helper(ints, 0);
    }
    private static boolean helper(int[] ints, int index) {
        if(index == ints.length-1 || ints.length ==0) return true;// edge cases should be handled
//        if(ints[index] > ints[index+1]) return false;
        return (ints[index] <= ints[index+1]) && helper(ints, index+1);
    }
}
