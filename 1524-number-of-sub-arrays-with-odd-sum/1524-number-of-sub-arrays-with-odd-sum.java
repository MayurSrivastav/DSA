class Solution {
    public int numOfSubarrays(int[] arr) {
        int n = arr.length;
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }
        long odd = 0, even = 0;
        for (int i = 0; i <= n; i++) {
            if (prefix[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        return (int) ((odd * even) % 1_000_000_007);
    }
}