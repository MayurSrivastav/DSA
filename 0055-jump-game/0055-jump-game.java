class Solution {
    public boolean canJump(int[] nums) {
        int i=nums.length-2;
        int j=nums.length-1;
        while(i>=0){
            if(i+nums[i]>=j){
                j=i;
            }
        i--;
        }
    return j==0;
    }
}