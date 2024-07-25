package com.aniket.Stack.GenericClass;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack(5);
//        stack.push(11);
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//        stack.push(16);
//        System.out.println(stack.peek());
//        stack.push(16);
//        stack.push(17);
//        stack.push(18);
//        stack.push(19);
//        stack.push(20);
//        stack.push(21);
//        System.out.println(stack.peek());
//        System.out.println(stack.ptr);


//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        QueueUsingStack q = new QueueUsingStack();
        q.add(12);
        q.add(13);
        q.add(15);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.isEmpty());;
        


    }
}
