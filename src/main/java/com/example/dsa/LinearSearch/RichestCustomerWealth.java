package com.example.dsa.LinearSearch;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int maxWealth = Integer.MIN_VALUE;
        for(int[] account : accounts){
            int total = Integer.MIN_VALUE;
            for(int i: account) total+=i;
            if(total>maxWealth) maxWealth = total;
        }
        System.out.println(maxWealth);
    }
}
