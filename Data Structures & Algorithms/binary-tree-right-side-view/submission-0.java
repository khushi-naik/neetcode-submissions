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
    List<Integer> res;
    public void view(TreeNode root, int index){
        if(root==null){
            return;
        }
        if(res.size()<=index){
            res.add(root.val);
        }
        else{
            res.set(index,root.val);
        }
        view(root.left,index+1);
        view(root.right,index+1);
        return;
    }

    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>();
        view(root, 0);
        return res;
    }
}
