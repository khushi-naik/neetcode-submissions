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
    //int maxDiameter = 0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int curr = height(root.left)+height(root.right);
        /*if(curr>maxDiameter){
            maxDiameter = curr;
        }
        return maxDiameter;*/
        return Math.max(curr,Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
    }
}
