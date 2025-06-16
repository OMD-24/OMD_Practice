package LeetCode;
import LeetCode.CircleList.*;
public class LeftRightLL {

    public static ListNode reverseBetween(ListNode head, int left, int right){
        ListNode l = new ListNode(0);
        l.next = head;
        ListNode r = head;
        ListNode temp = head;
        int i =1;
        while (i<left){
            l= l.next;
            r=r.next;
            i++;
        }
        while(i<right){
            r=r.next;
            i++;
        }
        ListNode prev = l;
        ListNode curr = prev.next;
        ListNode Next;
        while (curr != r){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        curr.next = null;

        return head;
    }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        // Swap nodes in pairs

        head = reverseBetween(head, 2 ,4);


        // Print swapped list: expected 2->1->4->3->null
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
