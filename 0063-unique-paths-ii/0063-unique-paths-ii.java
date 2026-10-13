class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return rec(m,n,dp,obstacleGrid);
    }
    public int rec(int m, int n, int dp[][],int[][] obstacleGrid) {
        if(m==0 || n==0){
            dp[m][n] = 0;
            return dp[m][n];
        }
        if(obstacleGrid[m-1][n-1]==1){
            return 0;
        }
        if(m==1 && n==1){
            dp[m][n] = 1;
            return dp[m][n];
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        dp[m][n] = rec(m-1,n,dp,obstacleGrid) + rec(m,n-1,dp,obstacleGrid);
        return dp[m][n];
    }
}
