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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level=0;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            Stack<Integer> stack = new Stack<>();
            while(size>0){
                if(level%2==0){
                    TreeNode node = queue.poll();
                    if(node.left!= null){
                        queue.offer(node.left);
                    }
                    if(node.right!= null){
                        queue.offer(node.right);
                    }
                    list.add(node.val);
                }else{
                    TreeNode node = queue.poll();
                    if(node.left!= null){
                        queue.offer(node.left);
                    }
                    if(node.right!= null){
                        queue.offer(node.right);
                    }
                    stack.push(node.val);
                }
                size--;
                if(level%2!=0 && size==0){
                    while(!stack.isEmpty()){
                        list.add(stack.pop());
                    }
                }
            }
            res.add(list);
            level++;
        }
        return res;
    }
}