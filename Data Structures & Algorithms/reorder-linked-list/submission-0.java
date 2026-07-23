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
    public void reorderList(ListNode head) {
        int ln = 0;
        ListNode hcopy = head;
        
        while(hcopy!=null){
            
            ln++;
            hcopy = hcopy.next;

        }

        hcopy = head;
        int i=0;
        ListNode first = null;
        while(i<=ln/2){
            first = hcopy;
            hcopy=hcopy.next;
            i++;
        }
        first.next = null;

        ListNode second = hcopy;
        ListNode prev=null;
        while(second!=null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode one = head;
        ListNode two = prev;
        i=0;
        while(two!=null){
            ListNode temp1 = one.next;
            ListNode temp2 = two.next;
            one.next = two;
            two.next = temp1;
            one = temp1;
            two = temp2;
            //i++; 
        }
    }
}
