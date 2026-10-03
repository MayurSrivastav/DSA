class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node prev = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                Node newNode = queue.poll();
                if (newNode.left != null) {
                    queue.offer(newNode.left);
                }
                if (newNode.right != null) {
                    queue.offer(newNode.right);
                }
                if (prev != null) {
                    prev.next = newNode;
                }
                prev = newNode;
                size--;
            }
            prev.next = null;
            prev = null;
        }
        return root;
    }
}