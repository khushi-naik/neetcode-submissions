/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> res;
    public void order(TreeNode root, int index){
        if(root==null){
            return;
        }
        if(res.size()<=index){
            ArrayList<Integer> li = new ArrayList<>();
            li.add(root.val);
            res.add(li);
        }
        else{
            res.get(index).add(root.val);
        }

        order(root.left, index+1);
        order(root.right, index+1);
        return;
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<>();
        order(root, 0);
        return res;
    }
}
