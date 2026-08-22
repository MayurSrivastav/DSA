class Solution {
    public int totalFruit(int[] f) {
        int n= f.length;
        int i=0;
        int j=0;
        int maxL=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j<n){
            map.put(f[j],map.getOrDefault(f[j],0)+1);
            while(map.size() > 2){
                map.put(f[i], map.get(f[i]) - 1);
                if(map.get(f[i]) == 0){
                    map.remove(f[i]);
                }
                i++;
            }
            maxL = Math.max(maxL,j-i+1);
        j++;
        }
        return maxL;
    }
}