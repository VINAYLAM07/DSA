package com.example.dsa.recursion;

public class Count {
    public static void main(String[] args) {
        System.out.println(countZeros(1023004009));
    }

    private static int countZeros(int i) {
        return helper(i, 0);
    }
    private static int helper(int i, int count ){
        if(i==0) return count;
        int digit = i%10;
        if(digit==0){
            count++;
        }
        return helper(i/10, count);
    }

}
