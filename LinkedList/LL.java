package LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

     public LL() {
        this.size=0;
    }

    public void insertFirst(int val){

        Node node = new Node(val);
        node.next =head;
        head = node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp+" ->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
        public static void main(String[] args) {
            LL list = new LL();

            list.insertFirst(1);
            list.insertFirst(2);
            list.insertFirst(3);
            list.insertFirst(4);
            list.insertFirst(5);

            list.display();

        }

}



