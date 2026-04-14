class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        ListNode curr = head;
        ListNode temp = head;
        for(int i=0;i<n;i++){
            temp=temp.next;
        }
        if(temp==null){
            return head.next;
        }
        while(temp.next!=null){
            temp=temp.next;
            curr=curr.next;
        }
        if(curr.next!=null)
            temp=curr.next.next;
        else
            temp=null;
        curr.next=temp;
        return head;
    }
}
