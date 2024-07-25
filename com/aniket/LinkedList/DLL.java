package com.aniket.LinkedList;

public class DLL {

    Node head;
    Node tail;
    int size;

    public void insertFirst(int val){
       Node node = new Node(val);
       node.next=head;
       node.prev=null;
        if (head != null) {
            head.prev=null;
        }
        head=node;
        size++;
    }
    public void Display(){
        Node temp = head;
        Node last =head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            last = temp;  temp=temp.next;}

        }
//        System.out.println("END");
//
//        System.out.print("Reverse Printing");
//
//        while(last!=null){
//            System.out.print(last.val+"->");
//            last =last.prev;}
//        System.out.print("Start");
//    }
   public  class  Node {
        int val;
        Node next;
        Node prev;

       public Node(int val) {
           this.val = val;
       }

       public Node(int val, Node next, Node prev) {
           this.val = val;
           this.next = next;
           this.prev = prev;
       }
   }
}
