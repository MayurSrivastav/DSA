class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int a = 1;
        int b = 1;
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                a++;
                b = 1;
            }
            else if (nums[i] < nums[i - 1]) {
                b++;
                a = 1;
            }
            else {
                a = 1;
                b = 1;
            }
            ans = Math.max(ans, Math.max(a, b));
        }
        return ans;
    }
}