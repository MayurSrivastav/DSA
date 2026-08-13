class Solution {
    public int findMaxLength(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <>();
        map.put(0,-1);
        int n = nums.length;
        int sum=0;
        int maxL=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum = sum + (-1);
            }
            else{
                sum += 1;
            }
            if(map.containsKey(sum)){
                maxL = Math.max(maxL,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
    return maxL;
    }
}