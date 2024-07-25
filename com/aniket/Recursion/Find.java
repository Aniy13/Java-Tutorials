package com.aniket.Recursion;

import java.util.ArrayList;

public class Find {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,4,4,5,6,7,7,7,7,7,8};
        System.out.println(Find(arr,8,0));
        System.out.println(FindIndex(arr,7,0));
        System.out.println(FindLI(arr,7, arr.length-1));
        FindAllIndex(arr,7,0);
        System.out.println(list);
        FindAll(arr,4,0,list1);
        System.out.println(list1);

    }
    static boolean Find(int[] arr,int target, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || Find(arr,target,index+1);
    }
    static int FindIndex(int[] arr,int target, int index){
        if(index== arr.length){
            return -1;
        }
        if( arr[index]==target){
            return index;
        }
        else{
            return FindIndex(arr,target,index+1);
        }

    }

    static int FindLI(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindLI(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void FindAllIndex(int[] arr,int target,int index){
        if(index== arr.length){
            return;
        }
        if(arr[index]==target){
            list.add(index);
        }
        FindAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> FindAll(int[] arr,int target,int index,ArrayList<Integer> list1){
        if(index== arr.length){
            return list1;
        }
        if(arr[index]==target){
            list1.add(index);
        }

        return FindAll(arr,target,index+1,list1);
    }

}
