package LeetCode;

public class SwapNodePairs {

    // Definition for singly-linked list.
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

    // Function to swap adjacent nodes recursively
    public static ListNode swapPairs(ListNode head) {
        // Base case: if the list is empty or has only one node, return it
        if (head == null || head.next == null) {
            return head;
        }

        // Nodes to be swapped
        ListNode first = head;
        ListNode second = head.next;

        // Recursive call for the rest of the list
        first.next = swapPairs(second.next);

        // Swapping
        second.next = first;

        // Return new head
        return second;
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Swap nodes in pairs
        head = swapPairs(head);

        // Print swapped list: expected 2->1->4->3->null
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


//package LeetCode;
//import java.util.LinkedList;
//public class SwapNodePairs {
//
//    public static class ListNode {
//         int val;
//          ListNode next;
//          ListNode() {}
//          ListNode(int val) { this.val = val; }
//          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//      }
//
//
//    public static void swap(ListNode prev, ListNode first, ListNode second){
//
//        if(first == null){
//            return ;
//        }
//
//        if(prev==null){
//            first.next = second.next;
//            second.next = first;
//            prev = first;
//
//            swap(prev, first, second);
//        }
//
//
//            prev.next = first.next;
//            first.next = second.next;
//            second.next = first;
//
//            prev = prev.next.next;
//            first = first.next.next;
//            second = first.next;
//
//        swap(prev, first, second);
//
//    }
//
//    public static ListNode swapPairs(ListNode head){
//
//        ListNode prev = null;
//        ListNode first = head;
//        ListNode second = head.next;
//
//        swap(prev, first, second);
//        return head;
//    }
//
//    public static void main(String args []){
//        // Create linked list 1: 2 -> 4 -> 3
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//
//
//        swapPairs(head);
//
//        ListNode temp = head;
//
//        while(temp != null){
//            System.out.print(temp.val  + "->");
//            temp = temp.next;
//        }
//        System.out.println();
//
//
//
//
//    }
//}
