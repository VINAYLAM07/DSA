package com.example.dsa.SlidingWindow;

import java.util.*;
public class LengthOfLongestSubString
{
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	public static int lengthOfLongestSubstring(String s) {
        int left=0, maxLength=0;
         Set<Character> set = new HashSet<>();
//        List<Character> set = new ArrayList<>();
        for(int right=0;right< s.length();right++){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(c);
                left++;
            }
            set.add(c);
            int length = right-left +1;
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}