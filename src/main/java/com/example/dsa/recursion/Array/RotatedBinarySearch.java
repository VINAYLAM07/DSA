package com.example.dsa.recursion.Array;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        System.out.println(find(new int[]{5,6,7,8,9,1,2,3}, 7, 0, 7));
        System.out.println(find(new int[]{8,9,1,2,3,4,5}, 2, 0, 6));
        System.out.println(find(new int[]{9,1,2,3,4,5}, 9, 0, 5));
    }

    private static int find(int[] ints, int target, int s, int e) {
        if(s>e) return -1;
        int m = s + (e-s)/2;
        if(ints[m]==target) return m;
        if(ints[s] < ints[m]){
            if(target<=ints[m] && target>=ints[s]){
                return find(ints, target, s, m-1);
            }else{
                return find(ints, target, m+1, e);
            }
        }
        if(target>=ints[m] && target<=ints[e]) {
            return find(ints, target, m+1, e);
        }

        return  find(ints, target, s, m-1);

    }


}
