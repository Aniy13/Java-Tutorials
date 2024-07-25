package com.aniket.Stack.GenericClass;

import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack.toString());
        stack.pop();
        System.out.println(stack.push(16));
        System.out.println(stack.toString());
        System.out.println(stack.peek());


    }


}
