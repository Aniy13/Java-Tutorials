package com.aniket.Recursion;

public class Nums {
    public static void main(String[] args) {

        fun(1);
    }
    static void fun(int n){
        if(n==6) return;

        fun(n+1);
        System.out.println(n);

    }
}
