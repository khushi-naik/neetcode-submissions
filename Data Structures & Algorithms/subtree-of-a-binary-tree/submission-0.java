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
    public boolean isSame(TreeNode a, TreeNode b){
        if(a==null && b==null){
            return true;
        }
        if((a==null && b!=null)||(a!=null && b==null)){
            return false;
        }

        return (a.val==b.val) && isSame(a.left,b.left) && isSame(a.right,b.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null && subroot==null){
            return true;
        }
        if((root==null && subroot!=null)||(root!=null && subroot==null)){
            return false;
        }
        boolean checkCurrNode = isSame(root, subroot);
    
        return checkCurrNode || isSubtree(root.left,subroot) || isSubtree(root.right,subroot);
    }
}
