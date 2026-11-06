class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs, (a, b) -> a[1] - b[1]);

        int m = queries.length;
        int[][] qs = new int[m][];
        for (int i = 0; i < m; i++) qs[i] = new int[]{queries[i], i};
        Arrays.sort(qs, (a, b) -> a[0] - b[0]);

        int[] cnt = new int[n + 1], ans = new int[m];
        int busy = 0, l = 0, r = 0;

        for (int[] q : qs) {
            while (r < logs.length && logs[r][1] <= q[0])
                if (cnt[logs[r++][0]]++ == 0){
                    busy++;
                }
            while (l < r && logs[l][1] < q[0] - x)
                if (--cnt[logs[l++][0]] == 0){
                    busy--;
                }
            ans[q[1]] = n - busy;
        }
        return ans;
    }
}