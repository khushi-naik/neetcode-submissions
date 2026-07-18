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
    public List<Integer> li;

    public void inorderTrav(TreeNode root){
        if(root==null){
            return;
        }
        inorderTrav(root.left);
        li.add(root.val);
        inorderTrav(root.right);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        li = new ArrayList<>();
        inorderTrav(root);
        return li.get(k-1);
    }
}
