/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class CopyLinkedListWithRandomPointer {
    public Node copyRandomList(Node head) {
        Map<Node,Node> map = new HashMap<Node,Node>();
        Node temp=head;
        while(temp!=null){
            map.put(temp, new Node(temp.val));
            temp=temp.next;
        }
        Node head2 = map.get(head);
        Node curr = head2;
        temp=head;
        while(  temp!=null){
            curr.next=map.get(temp.next);
            curr.random = map.get(temp.random);
            temp=temp.next;
            curr=curr.next;
        }
        return head2;
    }
}
