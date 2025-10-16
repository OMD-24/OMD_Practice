//package LeetCode;
//
//public class q_2 {
//
//    class ListNode {
//        public int val;
//        public ListNode next;
//
//        public ListNode(int val) {
//            this.val = val;
//        }
//
//        public ListNode(int val, ListNode next) {
//            this.val = val;
//            this.next = next;
//        }
//    }
//
//    public ListNode reverseL(ListNode h) {
//        if (h == null || h.next == null) {
//            return h;
//        }
//
//        ListNode prev = null;
//        ListNode curr = h;
//        ListNode next;
//
//        while (curr != null) {
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//
//        }
//
//        return prev;
//…    }
//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode r1 = reverseL(l1);
//        ListNode r2 = reverseL(l2);
//        int carry = 0;
//        ListNode result = new ListNode(-1);
//        ListNode resultHead = result;
//        while(r1 != null || r2 != null){
//            int x = (r1 != null) ? r1.val : 0;
//            int y = (r2 != null) ? r2.val : 0;
//            int sum = x + y + carry;
//            if(sum > 9){
//                ListNode newNode = new ListNode(sum % 10);
//                result.next = newNode;
//                result = newNode;
//                carry = sum / 10;
//            }
//            else{
//                ListNode newNode = new ListNode(sum);
//                result.next = newNode;
//                result = newNode;
//                carry = 0;
//
//            }
//
//            if (r1 != null) r1 = r1.next;
//            if (r2 != null) r2 = r2.next;
//        }
//
//        if (carry > 0) {
//            result.next = new ListNode(carry);
//        }
//
//
//        return resultHead.next;
//
//
//}
//}
