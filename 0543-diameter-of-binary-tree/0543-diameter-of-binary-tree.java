class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int max = 0;

        int a = maxDepth(root.left);
        int b = maxDepth(root.right);

        max = a + b;

        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        max = Math.max(max, left);
        max = Math.max(max, right);

        return max;
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}