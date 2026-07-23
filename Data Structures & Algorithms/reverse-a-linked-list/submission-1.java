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
    public ListNode reverseList(ListNode head) {
        ListNode start = head;
        ListNode prev = null;
        while(start!=null){
            ListNode temp = start.next;
            start.next = prev;
            prev = start;
            start = temp;
        }

        return prev;
        // ListNode curr = head;
        // ListNode prev = null;
        // while(curr != null){
        //     ListNode temp = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = temp;
        // }

        // return prev;
    }
}
