package LeetCode;
import LeetCode.q_206.ListNode;
public class q_203 {

    class Solution {
        public ListNode deleteMiddle(ListNode head) {

            if (head == null || head.next == null) return null;

            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            prev.next = slow.next;
            slow.next = null;

            return head;
        }
    }
}
