class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int dp[] = new int [n+1];
        Arrays.fill(dp,-1);
        return find(n,dp,cost);
    }
    public int find(int n,int []dp,int []cost){
        if(n<=1){
            dp[n]=0;
            return dp[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=Math.min(find(n-1,dp,cost)+cost[n-1],find(n-2,dp,cost)+cost[n-2]);
        return dp[n];
    }
}