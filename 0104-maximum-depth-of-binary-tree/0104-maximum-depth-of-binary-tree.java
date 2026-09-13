class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        int size=0;
        while (!queue.isEmpty()) {
            if(size==0){
                level++;
            }
            size = queue.size();

            while (size > 0) {
                TreeNode node = queue.poll();
                size--;

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return level;
    }
}