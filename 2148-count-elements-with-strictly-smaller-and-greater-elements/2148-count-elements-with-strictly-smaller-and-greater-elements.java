class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<n;i++){
            if(nums[i]>min && nums[i]<max){
                c++;
            }
        }
        return c;
    }
}