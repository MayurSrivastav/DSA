class Solution {
    public int searchInsert(int[] nums, int target) {
        int n= nums.length;
        int i=0;
        int j=n-1;
        int m=0;
        while(i<=j){
            m = i + (j-i)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]<target){
                i=m+1;
            }
            else{
                j=m-1;
            }
        }
        return i;
    }
}