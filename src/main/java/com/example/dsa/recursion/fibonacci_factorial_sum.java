package com.example.dsa.recursion;

public class fibonacci_factorial_sum {
    public static void main(String[] args) {
        System.out.println(fibo(5));
        System.out.println(factorial(5));
        System.out.println(sumOf(12345));
        System.out.println(productOf(52341));
    }

    private static int productOf(int i) {
        if(i%10==i) return i; //suppose for tht last number 5%10 is 5 so returns 5
        return (i%10) * productOf(i/10);
    }

    private static int sumOf(int i) {
        if(i==0) return 0;
        return i%10 + sumOf(i/10);
    }

    private static int factorial(int i) {
        if(i<=0) return 1;
        return i * factorial(i-1);
    }

    private static int fibo(int n) {
        if(n<2) return n;

        return fibo(n-1) + fibo(n-2);
    }
}
