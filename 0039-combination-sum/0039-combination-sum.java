class Solution {

    public List<List<Integer>> combinationSum(int[] c, int t) {

        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> cur = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        subset(c, t, 0, cur, ans, set);

        return ans;
    }

    public void subset(
            int[] c,
            int t,
            int i,
            ArrayList<Integer> cur,
            List<List<Integer>> ans,
            Set<List<Integer>> set) {

        if (i == c.length || t < 0) {
            return;
        }

        if (t == 0) {

            if (!set.contains(cur)) {

                ans.add(new ArrayList<>(cur));
                set.add(new ArrayList<>(cur));
            }

            return;
        }

        cur.add(c[i]);

        subset(c, t - c[i], i + 1, cur, ans, set);

        subset(c, t - c[i], i, cur, ans, set);

        cur.remove(cur.size() - 1);

        subset(c, t, i + 1, cur, ans, set);
    }
}