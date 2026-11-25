class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0){
            return 1;
        }
        int a = 10;
        int p = 9;

        for (int i = 1; i < n; i++) {
            p = p * (10 - i);
            a = a + p;
        }
        return a;
    }
}