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
    public boolean isBalanced(TreeNode root) {
        int height = maxDepth(root);
        if (height == -1){
            return false;
        }
        else{
            return true;
        }
    }
    public int maxDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftMax = maxDepth(root.left);
        int rightMax = maxDepth(root.right);
        if(leftMax == -1 || rightMax == -1){
            return -1;
        }
        if(Math.abs(leftMax - rightMax) > 1){
            return -1;
        }
        else{
            return 1+ Math.max(leftMax,rightMax);
        }
    }
}