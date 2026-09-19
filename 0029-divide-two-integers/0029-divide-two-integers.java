class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int ans = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= temp + temp) {
                temp = temp + temp;
                multiple = multiple + multiple;
            }

            a = a - temp;
            ans = ans + multiple;
        }

        if ((dividend < 0) ^ (divisor < 0)) {
            return -ans;
        }

        return ans;
    }
}