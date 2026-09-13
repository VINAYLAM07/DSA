package com.example.dsa.recursion.permutaions;

import java.util.ArrayList;
import java.util.List;

public class Reordering {
    public static void main(String[] args) {
        System.out.println(findPossibilities( "","abcde", new ArrayList<String>()));
        System.out.println(count);
    }
    static int count = 0;
    private static List<String> findPossibilities(String processed, String remaning, ArrayList<String> arr) {
        if(remaning.isEmpty()){
            arr.add(processed);
            count++;
            return arr;
        }
        for(int i=0;i<remaning.length();i++){
            char current = remaning.charAt(i);
            String left = remaning.substring(0,i);
            String right = remaning.substring(i+1);
            findPossibilities(processed+current, left+right, arr);
        }
        return arr;
    }
}
