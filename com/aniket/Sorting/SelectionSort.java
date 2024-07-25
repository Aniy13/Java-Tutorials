package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {3,5,2,5,1234,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));



    }
    static int[] selection(int[] arr){
        for(int i=0;i< arr.length;i++){
            int min = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]= temp;
            }
        }
        return arr;
    }
}
