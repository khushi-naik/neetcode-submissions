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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode list1 = l1;
        ListNode list2 = l2;
        ListNode arr = new ListNode(-1);
        ListNode arrHead = arr;
        int rem=0;

        while(list1!=null && list2!=null){
            ListNode newNode;
            if(list1.val+list2.val+rem >=10){
                
                //System.out.println(list1.val+list2.val+rem);
                newNode = new ListNode((list1.val+list2.val+rem)%10);
                rem = 1;

            }
            else{
                newNode = new ListNode(list1.val+list2.val+rem);
                rem=0;
            }
            arr.next = newNode;
            arr = arr.next;
            list1=list1.next;
            list2=list2.next;
        }

        while(list1!=null){
            ListNode newNode;
            if(list1.val+rem >=10){
                newNode = new ListNode((list1.val+rem)%10);
                rem=1;
            }
            else{
                newNode = new ListNode(list1.val+rem);
                rem=0;
            }
            arr.next = newNode;
            arr = arr.next;
            list1=list1.next;
        }

        while(list2!=null){
            ListNode newNode;
            if(list2.val+rem >=10){
                newNode = new ListNode((list2.val+rem)%10);
                rem=1;
            }
            else{
                newNode = new ListNode(list2.val+rem);
                rem=0;
            }
            arr.next = newNode;
            arr = arr.next;
            list2=list2.next;
        }
        if(rem>0){
            ListNode newNode = new ListNode(rem);
            arr.next = newNode;
        }

        return arrHead.next;
    }
}
