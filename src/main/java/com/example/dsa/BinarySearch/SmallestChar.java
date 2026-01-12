package com.example.dsa.BinarySearch;
public class SmallestChar {
    public static void main(String[] args) {
//        System.out.println(nextGreatestLetter1(new char[]{'e','e','e','e','e','e','n','n','n','n'},'e'));
        System.out.println(nextGreatestLetter1(new char[]{'c','f','j'},'f'));
//        System.out.println(nextGreatestLetter1(new char[]{'c','f','j'},'a'));
    }//{'c','f','j'},'d'
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        if(target >= letters[letters.length-1]) return letters[0];
        if(target < letters[start]) return letters[0];
        while(start<=end){
            int mid = (start)+(end-start)/2;
            if(target > letters[mid]){
                start = mid+1;
            }else if(target < letters[mid]){
                end = mid-1;
            }else if(target == letters[mid+1]){
                start=mid+1;
            }else return letters[mid+1];
        }
        return letters[start];
    }
    public static char nextGreatestLetter1(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[end]) return letters[0];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return letters[start];
    }
}
