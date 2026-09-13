package com.example.dsa.recursion.Subset_Subsequence_Strings;

public class RemoceACharacter {
    public static void main(String[] args) {
//        System.out.println(removeCharacter("aabcbadde", "a",0));
//        System.out.println(removeCharacter2("aabcbadde", 'a',0));
//        System.out.println(removeCharacter3("aabcbadde", ""));
        System.out.println(skipApple("pinepineapplecake", "apple", 0));
        System.out.println(skipApple2("pinepineapplecake", "apple"));
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

    private static String removeCharacter2(String string, char letter, int i) {
        if(i==string.length()) return "";
        char current = string.charAt(i);
        String restOfStr = removeCharacter2(string, letter, i+1);
        if(current != letter){
            return current + restOfStr;
        }
        return restOfStr;
    }
    private static String removeCharacter3(String string, String letter) {

        if(string.length()==0) return letter;
        char current = string.charAt(0);
        if(current == 'a'){
            return removeCharacter3(string.substring(1),letter);
        }else {
            return removeCharacter3(string.substring(1),letter+current);
        }
    }
    private static String skipApple(String string, String part, int index) {//bbapplepp
        if(index==string.length()) return string;
        if(string.substring(index).startsWith(part)){
            return skipApple(
                    string.substring(0,index)+
                            (string.substring(index+part.length(),string.length())), part, index+1);
        }else{
            return skipApple(string, part, index+1);
        }
    }
    public static String skipApple2(String string, String part){
        if(string.isEmpty()) return "";
        if(string.startsWith(part)){
            return skipApple2(string.substring(part.length()),part);
        }else{
            return string.charAt(0) + skipApple2(string.substring(1),part);
        }
    }
}
