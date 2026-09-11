package com.example.dsa.recursion.Subset_Subsequence_Strings;

public class RemoceACharacter {
    public static void main(String[] args) {
        System.out.println(removeCharacter("aabcbadde", "a",0));
        System.out.println(removeCharacter("aabcbadde", "a",0));
    }

    private static String removeCharacter(String string, String letter, int i) {
        String s = new String();
        if(i==string.length()) return s;
        if(!(String.valueOf(string.charAt(i)).equals(letter))){
            s += "" + string.charAt(i);
        }
        String ss = removeCharacter(string, letter, i+1);
        s+=ss;
        return s;
    }
}
