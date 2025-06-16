package LeetCode;

import LeetCode.CircleList.*;

public class RemoveDuplicates {

    public static ListNode remove(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }

        ListNode x = head;
        ListNode y = head.next;


        while (y != null){
            if (x.val == y.val){
                x.next = y.next;
                y = y.next;
            }
            else{
                x = x.next;
                y = y.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {

        CircleList.ListNode head = new CircleList.ListNode(1);
        head.next = new CircleList.ListNode(2);
        head.next.next = new CircleList.ListNode(2);
        head.next.next.next = new CircleList.ListNode(4);
        head.next.next.next.next = new CircleList.ListNode(5);


        head = remove(head);
        // Swap nodes in pairs



        // Print swapped list: expected 2->1->4->3->null
        CircleList.ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
