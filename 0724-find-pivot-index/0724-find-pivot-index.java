class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        int s1 = 0;
        for (int i = 0; i < n; i++) {
            left[i] = s1;
            s1 += nums[i];
        }

        int s2 = 0;
        for (int i = n - 1; i >= 0; i--) {
            right[i] = s2;
            s2 += nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (left[i] == right[i]){
                return i;
            }
        }
        return -1;
    }
}