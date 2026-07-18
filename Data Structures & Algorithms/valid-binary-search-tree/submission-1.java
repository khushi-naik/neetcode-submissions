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
    public List<Integer> list;
    public void populatelistbst(TreeNode root){
        if(root==null){
            return;
        }
        populatelistbst(root.left);
        list.add(root.val);
        populatelistbst(root.right);
        return;
    }
    public boolean isValidBST(TreeNode root) {
        list = new ArrayList<>();
        populatelistbst(root);
        for(int i=1;i<list.size();i++){
            if(list.size()>1 && list.get(i)<=list.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
