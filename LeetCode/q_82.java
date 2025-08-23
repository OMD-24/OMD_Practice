public class q_82 {
    

     static  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode deleteDuplicates(ListNode head){

        ListNode prev = null;
        ListNode curr = head;
        ListNode Next  ;

        ListNode newHNode = null;

        while (curr != null  ) {

             Next = curr.next;


            if(Next == null){

                if(prev == null){
                    prev = curr;
                    newHNode = curr;
                }

                prev.next = curr;
                prev = curr;
                return newHNode;
            }
            
          if((curr !=null && Next != null) && curr.val != Next.val)
            {
                if(prev == null){
                    prev = curr;
                    newHNode = curr;
                }

                prev.next = curr;
                prev = curr;
                curr = curr.next;
            }

            else {
                while(Next != null && curr.val == Next.val){
                    Next = Next.next;
                }

                curr = Next;
            }

           
            

        }

        return newHNode;

    }
}
