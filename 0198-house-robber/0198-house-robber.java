class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int [] dp = new int[n];
        Arrays.fill(dp,-1);
        return find(dp,nums,n-1);
    }
    public int find(int [] dp,int[] nums,int n){
        if(n==0){
            dp[n]=nums[n];
            return dp[n];
        }
        if(n==-1){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int Pick = nums[n]+find(dp,nums,n-2);
        int notPick = 0+ find(dp,nums,n-1);
        dp[n]=Math.max(Pick,notPick);
        return dp[n];
    }
}