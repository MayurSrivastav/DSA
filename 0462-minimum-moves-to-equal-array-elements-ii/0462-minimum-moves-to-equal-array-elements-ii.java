class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m = nums[nums.length/2];
        int c = 0;
        for(int i=0 ; i<nums.length ;i++){
            c += Math.abs(nums[i]-m);
        }
        return c;
    }
}