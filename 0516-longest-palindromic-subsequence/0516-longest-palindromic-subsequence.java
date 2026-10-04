class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int dp[][] = new int [n+1][n+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return find(1,n,dp,s);
    }
    public int find(int i,int j,int [][]dp,String s){
        if(i==j){
            dp[i][j]=1;
            return dp[i][j];
        }
        if(i>j){
            dp[i][j]=0;
            return dp[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i-1)==s.charAt(j-1)){
            dp[i][j]=2+find(i+1,j-1,dp,s);
            return dp[i][j];
        }
        int case1 = find(i+1,j,dp,s);
        int case2 = find(i,j-1,dp,s);
        dp[i][j] = Math.max(case1,case2);
        return dp[i][j];
    }
}