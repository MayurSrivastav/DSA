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
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        kSmallest(root,k,list);
        Collections.sort(list);
        int a= list.get(k-1);
        return a;
    }
    public void kSmallest(TreeNode root, int k,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        kSmallest(root.left,k,list);
        kSmallest(root.right,k,list);
    }
}