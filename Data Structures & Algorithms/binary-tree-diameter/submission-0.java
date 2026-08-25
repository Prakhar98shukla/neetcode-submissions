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
    int max;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        root(root);
        return max;

    }
    public int root(TreeNode root){
        if(root==null){
            return 0;
        } 
        int left= root(root.left);
        int right= root(root.right);
        max=Math.max(max,left+right);
        return Math.max(left,right)+1;
    }
}
