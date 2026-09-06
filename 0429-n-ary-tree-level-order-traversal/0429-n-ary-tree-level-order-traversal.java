/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if(root == null) {
            return ans;
        }
        queue.offer(root);
        int size = 1;
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            curr.add(node.val);
            size--;
            if(node.children != null) {
                for(Node child : node.children) {
                    if(child != null) {
                        queue.offer(child);
                    }
                }
            }
            if(size == 0) {
                ans.add(curr);
                curr = new ArrayList<>();
                size = queue.size();
            }
        }
        return ans;
    }
}