package LeetCode;
import LeetCode.q_206.ListNode;
public class q_234 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;


        }

        ListNode mid = slow;

        ListNode prev = null;
        ListNode curr = mid;
        ListNode next;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }


        ListNode start = prev;
        ListNode left = head;


        while(start != null){
            if(left.val != start.val){
                return false;
            }
            left = left.next;
            start = start.next;
        }

        return true;
    }
}
