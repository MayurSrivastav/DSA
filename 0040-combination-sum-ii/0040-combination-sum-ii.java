class Solution {

    public List<List<Integer>> combinationSum2(int[] c, int t) {

        Arrays.sort(c);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        find(0, c, t, list, ans);

        return ans;
    }

    public void find(
            int i,
            int[] c,
            int t,
            List<Integer> list,
            List<List<Integer>> ans) {

        if (t == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        if (i == c.length || t < 0) {
            return;
        }

        if (c[i] > t) {
            return;
        }


        list.add(c[i]);

        find(i + 1, c, t - c[i], list, ans);

        list.remove(list.size() - 1);

        int next = i + 1;

        while (next < c.length && c[next] == c[i]) {
            next++;
        }

        find(next, c, t, list, ans);
    }
}