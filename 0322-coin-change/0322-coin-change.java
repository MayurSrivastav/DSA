class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp [][] = new int[n][amount+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<amount+1;j++){
                dp[i][j]=-1;
            }
        }
        int result = find(coins,amount,n-1,dp);
        if(result == (int)(1e9)){
            return -1;
        }
        return result;
    }
    public int find(int[] coins, int amount,int i,int dp [][]){
        if(i==0){
            if(amount%coins[i]==0){
                dp[i][amount]= amount/coins[i];
                return dp[i][amount];
            }
            else{
                dp[i][amount]= (int)(1e9);
                return dp[i][amount];
            }
        }
        if(dp[i][amount]!=-1){
            return dp[i][amount];
        }
        int pick=(int)(1e9);
        if(amount>=coins[i]){
            pick = 1+find(coins,amount-coins[i],i,dp);
        }
        int notpick = find(coins,amount,i-1,dp);
        dp[i][amount]=Math.min(pick,notpick);
        return dp[i][amount];
    }
}