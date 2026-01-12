package com.example.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MaxValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(23,2,45,6,77,8,90,1,4));

        int max = Integer.MIN_VALUE;
        for (int i : list){
            if(i>max){
                max = i;
            }
        }
        System.out.println(max);
        new MaxValue().reverse(list);

    }
    public void reverse(ArrayList<Integer> arr){
        int min = 0;
        int max = arr.size()-1;
        while (min<max){
            int temp = arr.get(min);
            arr.set(min,arr.get(max));
            arr.set(max,temp);
            min++;
            max--;
        }
        System.out.println(arr);
    }

}
