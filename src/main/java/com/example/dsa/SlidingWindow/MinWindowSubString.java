package com.example.dsa.SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MinWindowSubString {
    public static  String minWindow(String s, String t) {
        int left=0;
        char[] charArray = new char[s.length()];
        java.util.Arrays.fill(charArray, 'a');
        String minString = new String(charArray);
        if(t.length()> s.length()){
            return "";
        }
        Map<Character, Integer> tChar = new HashMap<>();
        for (char c : t.toCharArray()) {
            tChar.put(c, tChar.getOrDefault(c, 0) + 1);
        }

        for(int right=1; right<=s.length(); right++ ){

            boolean validString = checkSubString(s.substring(left, right), tChar);
            while(validString){
                String str = new String(s.substring(left, right));
                minString = (minString.length() <= str.length()) ? minString : str;
                left++;
                validString = checkSubString(s.substring(left, right), tChar);
            }
        }
        return  minString;
    }
    public static boolean checkSubString(String s, Map<Character, Integer> tChar) {
            Map<Character, Integer> sCharCount = new HashMap<>();

            // Count characters in the substring `s`
            for (char c : s.toCharArray()) {
                sCharCount.put(c, sCharCount.getOrDefault(c, 0) + 1);
            }

            // Validate that `s` contains all characters from `tChar` with required counts
            for (Map.Entry<Character, Integer> entry : tChar.entrySet()) {
                char key = entry.getKey();
                int requiredCount = entry.getValue();
                if (sCharCount.getOrDefault(key, 0) < requiredCount) {
                    return false;
                }
            }

            return true;
        }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        System.out.println(minWindow("cabwefgewcwaefgcf", "cae"));
        System.out.println(minWindow("a", "b"));

    }
}