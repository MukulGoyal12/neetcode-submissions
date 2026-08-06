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
    public ListNode AddTwoNumbers(ListNode l1, ListNode l2) {   
         int carry=0;
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(t1!=null || t2!=null || carry!=0 ){
            int sum=carry;

            if(t1!=null){
                sum+=t1.val;
                t1=t1.next;
            }
            
            if(t2!=null){
                sum+=t2.val;
                t2=t2.next;
            }
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;

        } 
        return dummy.next;
    }
}
