class Solution {
    public int subarraysWithKDistinct(int[] n, int k) {
        return atMost(n, k) - atMost(n, k - 1);
    }
    public int atMost(int[] n, int k) {
        HashMap <Integer,Integer> map = new HashMap<>();
        int i=0,j=0,c=0;
        while(j<n.length){
            map.put(n[j],map.getOrDefault(n[j],0)+1);
            while(map.size()>k){
                map.put(n[i],map.get(n[i])-1);
                if(map.get(n[i])==0){
                    map.remove(n[i]);
                }
                i++;
            }
            c += j - i + 1;
            j++;
        }
        return c;
    }
}