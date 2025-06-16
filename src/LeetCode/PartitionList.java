package LeetCode;
import LeetCode.CircleList.*;

public class PartitionList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }





    public static int size(ListNode head) {
        ListNode temp = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        return i;
    }

   public static ListNode partition(ListNode head , int x){
       ListNode less = new ListNode(-1);
       ListNode gre = new ListNode(-1);
       ListNode newHead = less;
       ListNode mid = gre;
       ListNode temp = head ;


       while(temp != null){
           if(temp.val<x){
//               less = less.next;
               less.next = temp;
               less = less.next;

           }
           else {
               gre.next = temp;
               gre = gre.next;
           }
           temp = temp.next;
       }

       gre.next =null;
       less.next = mid.next;

       return newHead.next;
   }


    public static void main(String[] args) {

        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);


        // Swap nodes in pairs

        head = partition(head,3);

        // Print swapped list: expected 2->1->4->3->null
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
