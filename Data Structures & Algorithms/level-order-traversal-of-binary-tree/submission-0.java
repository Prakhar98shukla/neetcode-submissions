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
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        return dp(root,0);


    }
    public List<List<Integer>> dp(TreeNode root,int depth){
           if(root==null){
            return res;
            }
           if(res.size()==depth){
            res.add(new ArrayList<>());
           }
           res.get(depth).add(root.val);
           dp(root.left,depth+1);
           dp(root.right,depth+1);
           return res;

    }
}
