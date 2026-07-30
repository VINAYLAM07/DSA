package com.example.dsa.patterns;

public class pattern1 {

    public static void main(String[] args) {
//        pattern1(4);
        /* logic = no of row count == no of col count
        *
        * *
        * * *
        * * * *
        */
//        pattern2(4);
        /* logic no of rows/cols = n
        * * * *
        * * * *
        * * * *
        * * * *
        */
//        pattern3(4);
        /* logic: col = n-row
        * * * *
        * * *
        * *
        *
        */
//        pattern4(4);
       /*
        * * * *
          * * *
            * *
              *
        */
//        pattern5(4);
        /*
         *
         * *
         * * *
         * * * *
         * * *
         * *
         *
         * */
        pattern6(5);
    }

    private static void pattern6(int n) {
        for(int row=0; row<2*n;row++){//increasing row size for revers stars
            int rev =1;
            int spaces = (row <n) ? n-row : (n-rev);
            for(int col=0;col<=spaces;col++){
                System.out.print(" ");
                rev++;
            }
            int starsCount = (row<n) ? row : (2*n -row);//until <n taking row as a no of starts to print after  crossing it taking extended row limit - row
            for(int col=0;col<starsCount;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern5(int n) {
        for(int row=0; row<2*n;row++){//increasing row size for revers stars
            int starsCount = (row<n) ? row : (2*n -row);//until <n taking row as a no of starts to print after  crossing it taking extended row limit - row
            for(int col=0;col<starsCount;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern4(int n) {
        for(int row=0; row<n; row++ ){
            for (int col=0; col<n;col++){
                if(col>=row) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    private static void pattern3(int n) {
        for (int row=n; row>0;row--){
            for(int col=0; col<row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern2(int n) {
        for (int row=0;row<n;row++){
            for(int col=0; col<n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    public static void pattern1(int n){
        for(int row=0; row<4; row++){
            for(int col=0; col<=row;col++){
                System.out.print("* ");// col +" " --> for number pattern
            }
            System.out.println();
        }
    }
}
