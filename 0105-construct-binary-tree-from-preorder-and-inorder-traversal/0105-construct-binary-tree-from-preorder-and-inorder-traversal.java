class Solution {
    int pre = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return find(preorder, inorder, 0, inorder.length - 1);
    }
    public TreeNode find(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int value = preorder[pre++];
        TreeNode root = new TreeNode(value);
        int idx = start;
        while (inorder[idx] != value) {
            idx++;
        }
        root.left = find(preorder, inorder, start, idx - 1);
        root.right = find(preorder, inorder, idx + 1, end);
        return root;
    }
}