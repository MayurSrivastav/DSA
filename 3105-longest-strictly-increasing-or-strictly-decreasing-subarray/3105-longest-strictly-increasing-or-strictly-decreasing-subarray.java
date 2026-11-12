class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int ans = 1;
        for (int i = 0; i < n; i++) {
            int a = 1;
            int b = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[j - 1]) {
                    a++;
                } else {
                    break;
                }
            }
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[j - 1]) {
                    b++;
                } else {
                    break;
                }
            }
            ans = Math.max(ans, Math.max(a, b));
        }
        return ans;
    }
}