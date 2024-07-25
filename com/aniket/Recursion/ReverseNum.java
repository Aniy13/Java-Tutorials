package com.aniket.Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int num=111112;
           reverse(num);
//        System.out.println(revNum);
        System.out.println(palindrome(num));
    }

    static int revNum=0;
    static void reverse(int n){  //void
        if(n==0){
            return ;           // return;
        }
        int rem= n%10;
        revNum = (revNum *10) + rem;
        reverse(n/10);   // reverse(n/10)

    }
    static boolean palindrome(int n){
        return n== revNum;
    }
}
