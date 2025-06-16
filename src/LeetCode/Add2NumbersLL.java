package LeetCode;


import java.util.LinkedList;

public class Add2NumbersLL {

    public static class Node{
        int data;
        Node next;

        public Node(){};

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node sums(Node l1, Node l2, Node s, int prev){

        if(l1 == null && l2 == null ){
            if (prev > 0) {
                s.data = prev;
                s.next = null;
            }


            return s;
        }

        if(l1 != null && l2 !=null ) {
            int sum = l1.data + l2.data + prev;
            int unit = sum % 10 ;
            s.data = unit ;
            prev = sum/10;
            s.next = new Node();
            sums(l1.next,l2.next,s.next,prev);

        }

        else if (l2 != null){
            int sum =  l2.data + prev;
            int unit = sum % 10 ;
            s.data = unit ;
            prev = sum/10;
            s.next = new Node();
            sums(null,l2.next,s.next,prev);
        }

        else if(l1 != null){
            int sum = l1.data + prev ;
            int unit = sum % 10 ;
            s.data = unit ;
            prev = sum/10;
            s.next = new Node();
            sums(l1.next,null,s.next,prev);
        }


        return s;

    }

    public static Node addTwo(Node L1, Node L2){

        Node sumNode = new Node();
        return sums(L1,L2,sumNode,0);

    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String args []){
        // Create linked list 1: 2 -> 4 -> 3
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);

        // Create linked list 2: 5 -> 6 -> 4
        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node result = addTwo(l1, l2);
        printList(result);


    }
}
