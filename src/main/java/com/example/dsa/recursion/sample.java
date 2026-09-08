package com.example.dsa.recursion;

public class sample {
    public static void main(String[] args) {
//        print(1); //unwinding (descent) or tail recursion or pre-order execution
//        print1(5); //backtracking (ascent) or Post-order Executio
//        printRev(5);
//        printBoth(5);
        printConcept(5);
    }

    private static int printConcept(int i) {
        if(i==0) return 0;
        System.out.println(i);
        return printConcept(--i);
    }

    private static void printBoth(int i) {
        if (i == 0) return;
        if (!(i <= 0)) {
            System.out.println(i);
            printRev(i - 1);
        }
        System.out.println(i);
    }

    static void print(int n){
        System.out.println(n);
        if(n==5) return;
        print(n+1);
    }
    public static void print1(int i) {
 	    if(!(i<=0)){
 	        System.out.println(i);
 	        print1(i-1);
 	    }
 	}
     public static void printRev ( int i){
        if (i == 0) return;
        if (!(i <= 0)) {
            printRev(i - 1);
        }
        System.out.println(i);
     }

}
