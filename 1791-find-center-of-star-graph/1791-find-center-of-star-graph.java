class Solution {
    public int findCenter(int[][] edges) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = edges.length;
        for(int i=0;i<n;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            map.put(u,map.getOrDefault(u,0)+1);
            map.put(v,map.getOrDefault(v,0)+1);
            if(map.get(u)==n){
                return u;
            }
            if(map.get(v)==n){
                return v;
            }
        }
        return -1;
    }
}