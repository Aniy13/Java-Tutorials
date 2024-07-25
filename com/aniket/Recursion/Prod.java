package com.aniket.Recursion;

public class Prod {
    public static void main(String[] args) {
        int num=305;
        System.out.println(prod(num));
    }
    static int prod(int n){
    if(n%10==n){
        return n;
    }
    return (n%10) * prod(n/10);
    }
}
