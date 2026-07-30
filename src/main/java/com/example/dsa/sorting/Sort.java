package com.example.dsa.sorting;
import java.util.Arrays;
public class Sort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        int[] arr1 = {};
        int[] arr2 = {2,1};
        int[] arr3 = {1};
        int[] arr4 = {-35,1,0,-48,2};
//        bubbleSort(arr);
//        selectionSort(arr);
//        selectionSort(arr1);
//        selectionSort(arr2);
//        selectionSort(arr3);
//        selectionSort(arr4);
        insertionSort(arr);
        insertionSort(arr1);
        insertionSort(arr2);
        insertionSort(arr3);
        insertionSort(arr4);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));


    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int n = arr[i];
                int j = i - 1;
                while (j >= 0) {
                    if (n < arr[j]) {
                        arr[j + 1] = arr[j];
                        j--;
                    } else {
                        break;
                    }
                }
                arr[j + 1] = n;
            } else {
                continue;
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last = arr.length-1-i;
            int maxIndex = getMaxIndex(arr,0, last);
            swap(arr, maxIndex,last);

        }
    }

    private static void swap(int[] arr, int maxIndex, int last) {
        int maxNumber = arr[maxIndex];
        arr[maxIndex] = arr[last];
        arr[last] = maxNumber;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = start;
        for(int i=start; i<=last;i++){
            if(arr[i] >arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            boolean swapped = false;
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!(swapped)) break;
        }
    }
}
