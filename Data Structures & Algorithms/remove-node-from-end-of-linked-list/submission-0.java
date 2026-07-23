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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode prev = null;
        while(first!=null){
            ListNode temp = first.next;
            first.next = prev;
            prev = first;
            first = temp;
        }
        int i=1;
        ListNode second = prev;
        ListNode prev2 = null;
        while(second!=null){
            ListNode temp = second.next;
            if(i==n){
                //second.next.next=prev2;
                
            }
            else{
                second.next = prev2;
                prev2 = second;
            }
            
            
            second = temp;
            i++;
        }
        return prev2;
        
    }
}
