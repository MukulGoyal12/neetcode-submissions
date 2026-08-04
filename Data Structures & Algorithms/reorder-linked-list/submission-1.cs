/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

public class Solution {
    public void ReorderList(ListNode head) {
        ListNode middle = FindMiddle(head);
        ListNode TempHead = middle.next;
        middle.next=null;
        ListNode RevHead = ReverseHead(TempHead);
        ListNode temp=head;
        ListNode HS = temp;
        ListNode HR = RevHead;

        while(HR!=null && HS!=null){
            HS=HS.next;
            HR=HR.next;
            temp.next=RevHead;
            temp=HS;
            RevHead.next=temp;
            RevHead=HR;
        }
    }

    public ListNode ReverseHead(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode temp=head;
        while(temp!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    
    public ListNode FindMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;        
    }
}
