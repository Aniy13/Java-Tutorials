package com.aniket.Stack.GenericClass;

import java.util.Stack;

public class QueueUsingStack {
     public Stack<Integer> first;
     public Stack<Integer> second;

    public QueueUsingStack() {
        first=new Stack<>();
        second=new Stack<>();
    }
    public  void add(int item){
        first.push(item);
    }
    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int rem = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return rem;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

    public void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.add(12);
        q.add(13);
        q.add(15);
        q.remove();
        q.isEmpty();
        q.peek();

    }

}
