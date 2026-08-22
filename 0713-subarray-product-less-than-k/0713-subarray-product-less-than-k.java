class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0,count=0;
        int pro=1;
        while(j<nums.length){
            pro*=nums[j];
            if (k <= 1) {
                return 0;
            }
            while(pro>=k){
                pro/=nums[i];
                i++;
            }
            if(pro<k){
                count+= (j-i+1);
            }
            j++;
        }
        return count;
    }
}