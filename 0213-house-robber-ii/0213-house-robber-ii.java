class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(find (n,nums,0,n-1),find(n,nums,1,n));
    }
    public int find(int n,int[]nums,int x,int y){
        int prev1= nums[x];
        int prev2=0;
        int ans=nums[x];
        for(int i=x+1;i<y;i++){
            int Pick = nums[i]+prev2;
            int notPick = prev1;
            ans=Math.max(Pick,notPick);
            prev2=prev1;
            prev1=ans;
        }
        return ans;
    }
}