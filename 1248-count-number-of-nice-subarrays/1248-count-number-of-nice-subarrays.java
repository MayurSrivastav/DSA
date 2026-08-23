class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums, k) - find(nums, k - 1);
    }

    public int find(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int odd = 0;
        int count = 0;

        while (j < nums.length) {

            if (nums[j] % 2 != 0) {
                odd++;
            }

            while (odd > k) {
                if (nums[i] % 2 != 0) {
                    odd--;
                }
                i++;
            }
            count += j - i + 1;
            j++;
        }
        return count;
    }
}