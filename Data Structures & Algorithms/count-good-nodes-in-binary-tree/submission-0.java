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
    public int res=0;
    public void checkgn(TreeNode root, int currentMax){
        if(root==null){
            return;
        }
        if(root.val >= currentMax){
            res++;
            currentMax = root.val;
        }
        checkgn(root.left, currentMax);
        checkgn(root.right, currentMax);
        return;
    }

    public int goodNodes(TreeNode root) {
        checkgn(root, -101);
        return res;
    }
}
