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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode current = head;
        ListNode dummy = new ListNode(0);
        ListNode result = dummy;
        
        while(current!=null)
        { 
            if( current.next!=null && current.val==current.next.val)
            {
             int temp= current.val;
                while(current!=null && current.val==temp)
                {
                    current=current.next;
                }
            }
            else{
                result.next = new ListNode(current.val);
                result=result.next;
                current=current.next;
            }
        }
      
        return dummy.next;
    }
}