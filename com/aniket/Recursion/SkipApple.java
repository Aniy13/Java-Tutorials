package com.aniket.Recursion;

public class SkipApple {
    public static void main(String[] args) {
        String str = "pineapple_aniket_pineapple_Chopade_apple";
        System.out.println(skipAppleNotPineapple(str));
    }
    static String skipApple(String up){
        if(up.isEmpty()) return "";

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }
    static String skipAppleNotPineapple(String up){
        if(up.isEmpty()) return "";

        if (up.startsWith("apple") && !up.startsWith("pineapple")){
            return skipAppleNotPineapple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipAppleNotPineapple(up.substring(1));
        }
    }
}
