package com.aniket.Vector;

import java.util.Vector;
public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> num = new Vector<Integer>();

        num.add(12);
        num.capacity();
        System.out.println(num.capacity());
        System.out.println(num.size());


        Vector<String> vec = new Vector<>();
        vec.add("HII");
        vec.add("My name is Aniket");
        System.out.println(vec.capacity());
        System.out.println(vec.size());
    }
}
