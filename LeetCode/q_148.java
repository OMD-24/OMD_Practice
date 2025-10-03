package LeetCode;
import LeetCode.q_206.ListNode;
public class q_148 {

    public ListNode getMid(ListNode node) {
        if (node == null)
            return null;

        ListNode slow = node;
        ListNode fast = node;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode mergeSort(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);

        ListNode newHead = mid.next;
        mid.next = null;

        ListNode l = mergeSort(head);
        ListNode r = mergeSort(newHead);
        return merge(l, r);
    }

    public ListNode merge(ListNode l, ListNode r) {
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;

        while (l != null && r != null) {
            if (l.val <= r.val) {
                temp.next = l;
                l = l.next;
                temp = temp.next;
            }

            else {
                temp.next = r;
                r = r.next;
                temp = temp.next;
            }

        }

        while (l != null) {
            temp.next = l;
            l = l.next;
            temp = temp.next;
        }

        while (r != null) {
            temp.next = r;
            r = r.next;
            temp = temp.next;
        }

        return merged.next;
    }

    public ListNode sortList(ListNode head) {

        return mergeSort(head);

    }

    }
