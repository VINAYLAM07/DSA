package com.example.dsa.recursion.Subset_Subsequence_Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SubSeq {
    public static void main(String[] args) {
//        System.out.println(subSeq("","abc", new ArrayList<>()));
//        System.out.println(subseqRet("","abc"));
//        System.out.println('c'+0);
        System.out.println(subSetIter("abc"));
        System.out.println(getSubsetsIterative("abc"));

    }

    private static List<String> subSetIter(String s) {
        List<String> old = new ArrayList<>(Arrays.asList(""));
        List<String> current = new ArrayList<>();

        for (char c  : s.toCharArray()){
            ListIterator<String> iterator = old.listIterator();
            while (iterator.hasNext()){
                current.add(iterator.next() +c );
            }
            old.addAll(current);
            current.clear();
        }
        return old.subList(1,old.size());
    }

    public static List<List<String>> getSubsetsIterative(String str) {
        List<List<String>> outer = new ArrayList<>();

        // Step 1: Start with an empty subset
        outer.add(new ArrayList<>());

        // Step 2: Loop through every character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int n = outer.size(); // Get the current size before we add new ones

            // Step 3: For every existing subset, create a copy and add the new character
            for (int j = 0; j < n; j++) {
                // Create a new list based on an existing subset
                List<String> internal = new ArrayList<>(outer.get(j));
                internal.add(String.valueOf(ch));
                // Add the new modified subset back to the master list
                outer.add(internal);
            }
        }

        return outer;
    }


    private static List<String> subSeq(String p, String up, List<String> li) {
        if(up.isEmpty()) {
            li.add(p);
            return li;
        }
        char c = up.charAt(0);
        subSeq(p+c, up.substring(1), li);
        subSeq(p, up.substring(1), li);
        return li;
    }
    static ArrayList<String> subseqRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p + ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
