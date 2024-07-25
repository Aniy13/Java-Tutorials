package com.aniket.Recursion;



import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String str = "anik";
         subSeq("",str);
//        System.out.println(subSeqRet("",str));
//        subSeqAscii("",str);
//        System.out.println(asciiReturn("",str));
        System.out.println(str);

    }
    static void subSeq(String p,  String up ){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));

    }

    static ArrayList<String> subSeqRet(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);


        ArrayList<String> left = subSeqRet(p+ch,up.substring(1));
        ArrayList<String> right = subSeqRet(p,up.substring(1));

        left.addAll(right);
        return left;
    }
    static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+(ch+0),up.substring(1));
    }
    static ArrayList<String> asciiReturn(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left =asciiReturn(p+ch,up.substring(1));
        ArrayList<String> right =asciiReturn(p,up.substring(1));
        ArrayList<String> ascii =asciiReturn(p+(ch+0),up.substring(1));

        left.addAll(right);
        left.addAll(ascii);

        return left;

    }
}
