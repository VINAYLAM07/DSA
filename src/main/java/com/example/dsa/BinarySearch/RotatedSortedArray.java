package com.example.dsa.BinarySearch;

public class RotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};//[2, 5, 2, 2, 2], [10, 1, 10, 10, 10], [2, 2, 0, 2, 2], [2, 2, 2, 2, 0, 2]
//        System.out.println(search(arr, 4));
//        System.out.println(search(new int[] {2,9}, 0));
//        System.out.println(findPivot(new int[] {2,9,7}));
        System.out.println(findPivotWithDuplicates(arr));
        System.out.println(findPivotWithDuplicates(new int[] {2, 5, 2, 2, 2}));
        System.out.println(findPivotWithDuplicates(new int[] {10, 1, 10, 10, 10}));
        System.out.println(findPivotWithDuplicates(new int[] {2, 2, 0, 2, 2}));
        System.out.println(findPivotWithDuplicates(new int[] {2, 2, 2, 2, 0, 2}));

    }
    static public int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        if(pivot==-1) return binarySearch(arr, target, 0, arr.length-1);
        if(arr[pivot]==target) return pivot;
        if(arr[0] <= target) {
            return binarySearch(arr, target, 0, pivot-1);
        }

        return binarySearch(arr, target, pivot+1, arr.length-1);
    }
    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static public int findPivot(int[] arr) {// 4,5,6,7,0,1,2
        int start = 0;
        int end = arr.length-1;
        if(arr.length==1) return start;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[mid]<=arr[start]) {//if (arr[start] >= arr[mid]) for {2,9} - logic wrong
                //https://gemini.google.com/app/d23fd8cfd1426a45?utm_source=app_launcher&utm_medium=owned&utm_campaign=base_all
                end=mid-1;
            }else {
                start=mid+1;
            }
        }

        return -1;
    }
    //[2, 5, 2, 2, 2], [10, 1, 10, 10, 10], [2, 2, 0, 2, 2], , 2, 2, 2, 2, 0, 2]
    static public int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        if(arr.length==1) return start;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]) {
                return mid-1;
            }
            if(arr[start]==arr[mid] && arr[mid]==arr[end]) {
                if(start < end && arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if(end > start && arr[end] < arr[end-1]) {
                    return end-1;
                }
                end--;
            }
            if( arr[start]< arr[end]  || (arr[start]==arr[mid] && arr[mid] > arr[end])) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;
    }


}