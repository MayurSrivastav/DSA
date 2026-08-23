class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal)-find(nums,goal-1);
    }
    public int find(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        int i=0,j=0,c=0,sum=0;
        while(j<nums.length){
            sum+=nums[j];
            while(sum>k){
                sum-=nums[i];
                i++;
            }
            c += j - i + 1;
            j++;
        }
        return c;
    }
}