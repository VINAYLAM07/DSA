package com.example.dsa.recursion.Array;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{2,3,1,4,4,5}, 5,0));
        System.out.println(findAllIndexes(new int[]{2,3,1,4,4,5}, 4));
        System.out.println(findAllIndexes2(new int[]{2,3,1,4,4,5}, 4,0));
    }

    private static ArrayList<Integer> findAllIndexes2(int[] ints, int target, int i) {
        ArrayList<Integer> li = new ArrayList<>();
        if(i==ints.length) return li;
        // this will contain answer for that function call only
        if(ints[i]==target){
            li.add(i);
        }
        ArrayList<Integer> ansFromChild = findAllIndexes2(ints, target, i+1);
        li.addAll(ansFromChild);//this line will execute when functional calls are removing from stack
        return li;
    }

    private static ArrayList<Integer> findAllIndexes(int[] ints, int target) {
        return helper(ints,target, 0, new ArrayList<>());

    }
    private static ArrayList<Integer> helper(int[] ints, int target,int index, ArrayList<Integer> indexes) {
        if(index==ints.length) return indexes;
        if(ints[index]==target) indexes.add(index);
        return helper(ints, target, index+1, indexes);// recognize same list object is being passed ( indexes)


    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }
}
