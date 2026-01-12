package com.example.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello world..");
        Scanner sc = new Scanner(System.in);
//        //Methods to declare array
//        int[] nums = new int[5];
//        int[] nums = {1,2,3,4,5};
//        //Methods to print array
//        for(int i=0;i<nums.length;i++){ nums[i] = sc.nextInt(); }
//        for (int n : nums ) {System.out.print(n);}
//        System.out.println(Arrays.toString(nums));
        //declaring 2D array
        int[][] arr2D = new int[3][];//column size is not mandatory
        int[][] arr2D2 = {
                {11,223,76},
                {43,55},
                {45}
        };
        for(int[] n : arr2D2)
            System.out.println(Arrays.toString(n));

        for(int i=0;i< arr2D.length;i++){
            System.out.println("Define "+i+"col limit: ");
            int colDef = sc.nextInt();
            arr2D[i] = new int[colDef];
            System.out.println("In row " +i+" Enter "+colDef+" numbers");
            for(int j=0;j<colDef;j++){
                arr2D[i][j]= sc.nextInt();
            }
        }

        for(int[] n : arr2D)
            System.out.println(Arrays.toString(n));
    }
}
