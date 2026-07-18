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
    public int help(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = help(root.left);
        int r = help(root.right);
        if(maxi<l+r){
            maxi = l+r;
        }
        return 1+Math.max(l,r);
    }
    int maxi=0;
    public int diameterOfBinaryTree(TreeNode root) {
        //help(root);
        //return maxi;
        if(root==null){
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        int d = l+r;
        return Math.max(d,Math.max(diameterOfBinaryTree(root.left),diameterOfBinaryTree(root.right)));
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
}
