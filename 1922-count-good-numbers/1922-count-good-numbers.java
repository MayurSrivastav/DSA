class Solution {

    long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long even = power(5, (n + 1) / 2);
        long odd = power(4, n / 2);

        return (int)((even * odd) % MOD);
    }

    public long power(long a, long b) {

        if (b == 0) {
            return 1;
        }

        long half = power(a, b / 2);

        long result = (half * half) % MOD;

        if (b % 2 == 1) {
            result = (result * a) % MOD;
        }

        return result;
    }
}