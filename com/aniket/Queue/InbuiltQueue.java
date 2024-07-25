package com.aniket.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(14);
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();
//        q.remove();

        System.out.println(q.toString());
        System.out.println(q.peek());               // pekk = first element (heaD) it return when queue is empty
      // System.out.println(q.element());            // elemet is also  peek but gives error when empty queue


        System.out.println( q.poll());              // returns head of queue and delete the head
        System.out.println(q.peek());

        System.out.println(q.offer(99));         // returns a true and add element
        System.out.println(q.toString());
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=10;i++){
            int j = i*5;
            list.add(j);
        }

        System.out.println(q.addAll(list));
        System.out.println(q.toString());





    }
}
