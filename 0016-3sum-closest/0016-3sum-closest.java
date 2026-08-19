class Solution {
    public int threeSumClosest(int[] n, int t) {
        Arrays.sort(n);
        int ans = 0;
        boolean first = true;
        for (int i = 0; i < n.length - 2; i++) {
            int left = i + 1;
            int right = n.length - 1;
            while (left < right) {
                int sum = n[i] + n[left] + n[right];
                if (first) {
                    ans = sum;
                    first = false;
                }
                if (Math.abs(t - sum) < Math.abs(t - ans)) {
                    ans = sum;
                }
                if (sum == t) {
                    return sum;
                }
                if (sum < t) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return ans;
    }
}