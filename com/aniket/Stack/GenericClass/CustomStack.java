package com.aniket.Stack.GenericClass;

public class CustomStack {
    protected  int[] data;
    int ptr =-1;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    public boolean push(int item){
        if( isfull()){
            System.out.println("Stack Overflow!!");
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    public int pop() throws Exception {
        if(isempty()){
            throw new Exception("Can't pop it");
        }
        int rem = data[ptr];
        ptr--;
        return rem;
    }
    public boolean isfull(){
        return ptr==data.length-1;
    }
    private boolean isempty(){
    return ptr==-1;
    }
    public int peek(){
        return data[ptr];
    }
}
