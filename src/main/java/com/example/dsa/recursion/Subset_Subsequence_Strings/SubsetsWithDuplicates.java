package com.example.dsa.recursion.Subset_Subsequence_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup("aab"));
    }

    public static List<List<String>> subsetsWithDup(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Rule 1: Always sort first

        List<List<String>> outer = new ArrayList<>();
        outer.add(new ArrayList<>()); // Start with empty subset

        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            startIndex = 0;
            
            // Rule 2: If current character is same as previous, 
            // restrict the starting point to only the newly added subsets from last iteration
            if (i > 0 && chars[i] == chars[i - 1]) {
                startIndex = endIndex;
            }
            
            // Update endIndex to mark the current size before we expand
            endIndex = outer.size();

            for (int j = startIndex; j < endIndex; j++) {
                // Create a copy of an existing subset and add the current character
                List<String> internal = new ArrayList<>(outer.get(j));
                internal.add(String.valueOf(chars[i]));
                outer.add(internal);
            }
        }

        return outer;
    }
}