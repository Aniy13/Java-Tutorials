package com.aniket.Recursion;

public class SortedOrNot {
    public static void main(String[] args) {
        int[] arr ={ 1,2,3,4,5,6};
        System.out.println(sortedornot(arr,0));
    }
    static boolean sortedornot(int[] arr ,int index ){
        if(index==arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1]  && sortedornot(arr,index+1);
    }
}
