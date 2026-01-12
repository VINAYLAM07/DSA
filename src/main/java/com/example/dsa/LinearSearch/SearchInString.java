package com.example.dsa.LinearSearch;

public class SearchInString {
    public static void main(String[] args) {

        //Search with loop and enhanced for loop
        String s = "vinay lam";
        char target = ' ';
        for(int i=0;i<s.length();i++){
            System.out.print(s.charAt(i));
        }
        System.out.println("");
        System.out.println(find(s,target));
    }

    public static boolean find(String s, char target){
        if((s.isEmpty()) || (target =='\0') ) return false;
        for (char c:s.toCharArray()
        ) {
            if(c==target) return true;
        }
        return false;
    }
}
