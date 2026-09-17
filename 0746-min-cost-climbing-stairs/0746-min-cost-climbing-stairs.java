class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];
        cost(cost, dp, 0);
        int min = dp[n];
        return min;
    }

    public void cost(int[] cost, int[] dp, int j) {
        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i <= cost.length; i++) {
            int a = Math.min(cost[i - 1] + dp[i - 1],cost[i - 2] + dp[i - 2]);
            dp[i] = a;
        }
    }
}