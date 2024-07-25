package com.aniket.Recursion;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list= new ArrayList<>();
    public static void main(String[] args) {
           int[] arr ={ 1,1,1,2,3,4,5,6,7,5,5,8};
        System.out.println(findallindex(arr,0,1,list));
    }
    static boolean ispresent(int[] arr,int index, int target){
        if(index== arr.length) return false;

       return arr[index]==target || ispresent(arr,index+1,target);
       }

       static int findindex(int[] arr , int index , int target, ArrayList<Integer> list){
        if(index== arr.length) return -1;
        if(arr[index]==target){
            return index;
        }
        return findindex(arr,index+1,target, list);
       }

       static  ArrayList findallindex(int[] arr , int index , int target , ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(target==arr[index]){
            list.add(index);
        }
        return findallindex(arr,index+1,target,list);

       }


}
