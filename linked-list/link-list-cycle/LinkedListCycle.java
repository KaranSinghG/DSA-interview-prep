class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode c1 = head;
        ListNode c2 = head;
        while(c2!=null && c2.next!=null){
            c1=c1.next;
            c2=c2.next.next;
            if(c1==c2){
                return true;
            }
        }
        return false;
    }
}
