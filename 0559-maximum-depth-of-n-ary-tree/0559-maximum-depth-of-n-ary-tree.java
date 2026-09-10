class Solution {
    public int maxDepth(Node root) {
        if(root==null) return 0;

        Queue<Node> queue=new LinkedList<>();
        queue.offer(root);
        int level=0;

        while(!queue.isEmpty()){
            int size=queue.size();

            while(size>0){
                Node node=queue.poll();

                for(Node child:node.children){
                    queue.offer(child);
                }

                size--;
            }

            level++;
        }

        return level;
    }
}