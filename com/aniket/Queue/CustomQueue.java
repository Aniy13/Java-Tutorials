package com.aniket.Queue;

public class CustomQueue {
    private int[] data;
    private final static int DEFAULT_SIZE=10;
    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public boolean isfull(){
        return end==data.length;
    }
    private boolean isempty(){
        return end==0;
    }
    public boolean Insert(int item) throws Exception {
        if(isfull()){
            throw new Exception("SIZE is Full");
        }
        data[end]=item;
        end++;
        return true;
    }
    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        int rem = data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
        return rem;
    }
    public int Front() throws Exception{
        if(isempty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void Display(){
        for (int i = 0; i <end ; i++) {
            System.out.println(data[i]+"-<");
        }
        System.out.println("End");

    }
}
