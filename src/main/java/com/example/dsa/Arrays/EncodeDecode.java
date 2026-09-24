package com.example.dsa.Arrays;

import java.util.*;
public class EncodeDecode
{
	public static void main(String[] args) {
//		String sss = encode(new ArrayList<>(Arrays.asList("Hello", "world", "java")));
//		System.out.println(sss);
//		System.out.println(Arrays.asList(decode(sss)));
 		String sss = encode(new ArrayList<>(Arrays.asList("we","say",":","yes","!@#$%^&*()")));
 		System.out.println(sss);
 		System.out.println(Arrays.asList(decode(sss)));
	}
	
	public static  String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs){
            int l = s.length();
            sb.append(l).append("#").append(s);

        }
        return sb.toString();
    }

    public static List<String> decode(String str) {
        List<String> li = new ArrayList<>();
        for(int i=0;i<str.length()-1;i++){

//            int len = len = Integer.valueOf(str.charAt(i)-'0');
            int len = 0;

            while(str.charAt(i)>=48 && str.charAt(i)<=57){
                len = len*10 + (str.charAt(i)-'0');
                i++;
            }
            System.out.println("i "+i);
            System.out.println("len "+len);
            li.add(str.substring(i+1, i+len+1));
            System.out.println(li);
            i+=len;
        }
        
        return li;
    }
	
	
	
	public static  boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(Character c : s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0)+1);
        }
        for(Character d : t.toCharArray()){
            tMap.put(d, tMap.getOrDefault(d, 0)+1);
        }
        System.out.println(sMap);
        System.out.println(tMap);
        return sMap.equals(tMap);
    }
}