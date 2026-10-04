class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int prev1 = nums[0];
        int prev2 = 0;
        int ans = 0;
        for(int i=1;i<n;i++){
            ans = Math.max(prev1,(nums[i]+prev2));
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}