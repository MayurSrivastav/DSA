class Solution {
    public int minMoves(int[] nums) {

        int n = nums.length;

        int sum = 0;
        int min_el = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            min_el = Math.min(min_el, nums[i]);
        }

        return sum - n * min_el;
    }
}