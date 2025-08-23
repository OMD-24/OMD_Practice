
import java.util.Stack;

public class q_143 {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }    
    }

        public static Node head;
        public static Node tail;
        public static int size;

        public void addFirst(int data) {
            //step-1 : Create a new node
            Node newNode = new Node(data);

            {
                // if the node is empty at first
                if (head == null) {
                    head = tail = newNode;
                    size++;
                    return;
                }
            }


            //step-2 : assign head
            newNode.next = head;

            //jump to new head
            head = newNode;
            size++;
        }

     public static void  reorderList(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;
        Node Rh = mid.next;
        mid.next = null;
        

        Stack<Node> s = new Stack<>();
        while(Rh != null){
            s.push(Rh);
            Rh = Rh.next;
        }

      

        Node l = head;
        Node r;

        Node nextlh;
        


        while(l != null  && !s.empty()){
            nextlh = l.next;
            r = s.pop();
            
            l.next = r;
            
            r.next = nextlh;

            l = nextlh;
        }
        

         
        }
    


    public static void main(String[] args) {
        q_143 l = new q_143();

        l.addFirst(4);
        l.addFirst(3);
        l.addFirst(2);
        l.addFirst(1);

        reorderList(head);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->  ");
            temp = temp.next;

        }
    }
}
