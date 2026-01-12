package com.example.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int p=0;p<3;p++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        new ArrayOfArray().swap(list.get(1), 1,2);
    }
    public void swap(ArrayList<Integer> arr, int index1, int index2){
        int temp = arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2, temp);
        System.out.println(arr);
    }

}
