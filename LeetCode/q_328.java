package LeetCode;
import LeetCode.q_206.ListNode;
public class q_328 {
    class Solution {

        public ListNode oddEvenList(ListNode head) {
            if (head == null || head.next == null) return head;
            int cnt = 0;

            ListNode odd = head;
            ListNode even = head.next;
            ListNode evenList = even;

            while (even != null && even.next != null) {
                cnt++;
                if (cnt % 2 != 0) {
                    odd.next = even.next;
                    odd = odd.next;
                } else {
                    even.next = odd.next;
                    even = even.next;
                }
            }
            odd.next = evenList;

            return head;
        }
    }
}