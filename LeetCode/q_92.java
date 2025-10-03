package LeetCode;
import LeetCode.q_206.ListNode;

public class q_92 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        ListNode l = head;
        ListNode prev = null;
        int i = 1;
        while (i < left) {
            prev = l;
            l = l.next;
            i++;
        }

        ListNode start = prev;
        ListNode end = l;
        prev = l;
        ListNode curr = l.next;
        ListNode next;

        while (i < right) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            i++;
        }

        if (start != null) {
            start.next = prev;
        } else {
            head = prev;
        }
        end.next = curr;

        return head;
    }
}
