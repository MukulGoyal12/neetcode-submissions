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
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int num = count-n;

        if(count==1)return null;
        if(num==0)return head.next;
        
        for(int i=0;i<num-1;i++){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=fast.next;
        return head;
    }
}
