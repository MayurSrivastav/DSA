class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(n,m,dp,text1,text2);
    }
    public int find(int i,int j,int [][] dp,String text1,String text2){
        if(i==0 || j==0){
            dp[i][j]=0;
            return dp[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i-1) == text2.charAt(j-1)){
            dp[i][j] = 1 + find(i-1,j-1,dp,text1,text2);
            return dp[i][j];
        }
        int case1 = find(i-1,j,dp,text1,text2);
        int case2 = find(i,j-1,dp,text1,text2);
        dp[i][j]=Math.max(case1,case2);
        return dp[i][j];
    }
}