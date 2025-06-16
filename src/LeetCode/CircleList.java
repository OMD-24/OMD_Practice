package LeetCode;

public class CircleList {

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

        public static ListNode rotateRight(ListNode head, int k) {
            if (head == null || head.next == null || k == 0) return head;

            int len = size(head);
            k = k % len;
            if (k == 0) return head;

            int stepsToNewHead = len - k;

            // Move to the node just before new head
            ListNode prev = head;
            for (int i = 1; i < stepsToNewHead; i++) {
                prev = prev.next;
            }

            // Set new head and break the list
            ListNode newhead = prev.next;
            prev.next = null;

            // Traverse to the end of the new list
            ListNode tail = newhead;
            while (tail.next != null) {
                tail = tail.next;
            }

            // Connect the end to the old head
            tail.next = head;

            return newhead;
        }


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        // Swap nodes in pairs

        head = rotateRight(head,2);

        // Print swapped list: expected 2->1->4->3->null
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
