package com.example.dsa.recursion;

public class ReverseANumber_Palindrome {
    public static void main(String[] args) {
        revWithOutSideVariable(12345);
        System.out.println(sum);
        System.out.println(rev2(12345));
        System.out.println(isPalindrome(123454321));

    }

    private static boolean isPalindrome(int i) {
        return i==rev2(i);
    }

    private static int rev2(int i) {
        return revHelper(i, 0);
    }
    private static int  revHelper(int i, int revNum) {
        if(i==0) return revNum;
        int digit = i%10;
        revNum = (revNum*10) + digit;
        return revHelper(i/10, revNum);
    }

    static  int sum = 0;
    private static void revWithOutSideVariable(int i) {
        if(i==0){
            return;
        }
        sum = (sum*10) + (i%10) ;
        revWithOutSideVariable(i/10);
    }

}
