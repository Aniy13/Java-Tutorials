package com.aniket.Recursion;

public class NoOfZeros {
    public static void main(String[] args) {
        System.out.println(noofzeros(103000005,0));

    }
    static int noofzeros(int n, int c){
        if(n==0) return c;

        int rem = n%10;
        if(rem==0){
            return noofzeros(n/10,c+1);
        }
           return noofzeros(n/10,c);
    }
}
