/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = l1;
        ListNode second = l2;
        ListNode head = new ListNode();
        int carry=0;
        ListNode temp = head;
        while(first!=null || second!=null){
            int sum = carry;
            if(first!=null){
                sum+=first.val;
                first=first.next;
            }
            if(second!=null){
                sum+=second.val;
                second=second.next;
            }
            if(sum>9){
                carry=1;
                sum=sum-10;
            } else {
                carry=0;
            }
            temp.next = new ListNode(sum);
            temp=temp.next;   
        }
        temp.next = carry>0? new ListNode(carry):null;
        
        return head.next;
    }
}
