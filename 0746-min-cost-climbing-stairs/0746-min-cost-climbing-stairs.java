class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return minCost(cost,dp,n);
    }
    public int minCost(int[] cost,int [] dp,int n) {
        if(n==0|| n==1){
            dp[n]=0;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a = cost[n-1]+minCost(cost,dp,n-1);
        int b = cost[n-2]+minCost(cost,dp,n-2);
        dp[n]=Math.min(a,b);
        return dp[n];
    }
}