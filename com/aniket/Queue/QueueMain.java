package com.aniket.Queue;

public class QueueMain {
    public static void main (String[] args) throws Exception{
        CustomQueue q = new CustomQueue();
        q.Insert(11);
        q.Insert(12);
        q.Insert(13);
        q.Insert(14);
        q.Insert(15);
        System.out.println(q.Insert(16));
        System.out.println(q.toString());

    }
}
