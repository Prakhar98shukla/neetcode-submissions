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
    class check{
        int h;
        boolean hb;
        check(int h,boolean hb){
            this.h=h;
            this.hb=hb;
        }
    }
    public boolean isBalanced(TreeNode root) {
         return depth(root).hb;

    }

    public check depth(TreeNode root){
        if(root==null){
            return new check(0,true);
        }
        boolean t=false;
        int bal=depth(root.left).h-depth(root.right).h;
        boolean c=depth(root.left).hb&&depth(root.right).hb;
        if(Math.abs(bal)<=1&&c){
            t=true;
        }
        return new check(1+Math.max(depth(root.left).h,depth(root.right).h),t);
    }
}
