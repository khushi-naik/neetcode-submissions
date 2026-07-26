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

class Solution {
    public Node copyRandomList(Node head) {
        Node res =new Node(-1);
        Node resHead = res;
        Node orgHead = head;
        Node prev = res;
        HashMap<Node,Node> hm = new HashMap<>();
        while(orgHead!=null){
            Node newNode = new Node(orgHead.val);
            hm.put(orgHead, newNode);
            prev.next = newNode;
            prev = newNode;
            orgHead = orgHead.next;
        }

        orgHead = head;
        Node newList = res.next;
        while(orgHead!=null){
            newList.random = hm.get(orgHead.random);
            newList=newList.next;
            orgHead = orgHead.next;
        }
        return resHead.next;
        
    }
}
