import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] c, int t) {

        List<List<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> cur = new ArrayList<>();

        subset(c, t, 0, cur, ans);

        return ans;
    }

    public void subset(
            int[] c,
            int t,
            int i,
            ArrayList<Integer> cur,
            List<List<Integer>> ans) {

        if (i == c.length || t < 0) {
            return;
        }

        if (t == 0) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        cur.add(c[i]);

        subset(c, t - c[i], i, cur, ans);

        cur.remove(cur.size() - 1);

        subset(c, t, i + 1, cur, ans);
    }
}