package com.aniket.Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] nums= {1,4,6,9,34,78,25,895,25673,256,44,79};
        mergeSort(nums,0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    static void mergeSort(int[] nums , int low , int high){
        if(low>=high) return;
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot = nums[mid];

        while (s<=e){
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot) {
                e--;
            }

            if(s<=e){
                // swap
                int temp = nums[e];
                nums[e]=nums[s];
                nums[s]=temp;
                s++;
                e--;
            }
            mergeSort(nums,low,e);
            mergeSort(nums,s,high);
        }
    }
}
