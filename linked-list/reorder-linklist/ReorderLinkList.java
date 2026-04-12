class ReorderLinkList {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head2;
        while(curr!=null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp = head;
        ListNode temp2 = null;
        ListNode temp3 = null;
        while(temp!=null){
            temp2=temp.next;
            temp.next=prev;
            if(prev!=null){
                temp3=prev.next;
                prev.next=temp2;
                prev=temp3;
            }
            temp=temp2;
        }
    }
}
