/*
// Definition for a Node.
public class Node {
    public int val;
    public Node next;
    public Node random;
    
    public Node(int _val) {
        val = _val;
        next = null;
        random = null;
    }
}
*/

public class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node curr=head;
        while(curr!=null){
            Node newNode = new Node(curr.val);
            newNode.next=curr.next;
            curr.next=newNode;
            curr=newNode.next;
        }

        Node temp=head;
        while(temp!=null){
            if(temp.random!=null)
                temp.next.random = temp.random.next;
            temp=temp.next.next;
        }

        Node newHead=head.next;
        Node current=head;
        Node newCurr=newHead;
        while(current!=null && newCurr!=null){
            current.next=newCurr.next;
            current=current.next;
            if(current!=null){
                newCurr.next=current.next;
                newCurr=newCurr.next;
            }
        }

        return newHead;
    }
}
