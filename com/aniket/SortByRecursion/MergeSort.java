package com.aniket.SortByRecursion;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {22,45,2,8,56,34,567,9,78,36,6,2345};
//        int[] mergeArr = mergesort(arr);
//        System.out.println(Arrays.toString(mergeArr));

        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static int[] mergesort(int[] arr){
        if(arr.length==1) return arr;

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergesort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;



        while(i<first.length && j< second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }
            else {
                mix[k]=second[j];
                j++;
            }
            k++;}

            while(i< first.length){
                mix[k]=first[i];
                i++;
                k++;
            }
            while(j< second.length){
                mix[k]=second[j];
                j++;
                k++;
            }



        return mix;
    }

    static void mergeSortInPlace(int[] arr, int s , int e ){
        if(e-s==1) return;

        int mid = (s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }
    private static void mergeInPlace(int[] arr,int s ,int m, int e){
        int[] mix = new int[e-s];
        int i=s;
        int j=m;
        int k=0;

        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<m){
            mix[k]=arr[i];
            i++;
            j++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }

        for(int l=0;l< mix.length;l++){
            arr[s+l]=mix[l];
        }
    }

}
