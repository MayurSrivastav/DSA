import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        find(1, k, n, curr, ans);

        return ans;
    }

    public void find(int i, int k, int n,List<Integer> curr,List<List<Integer>> ans) {

        if (n == 0 && curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (i > 9 || curr.size() >= k || n < 0) {
            return;
        }

        curr.add(i);

        find(i + 1, k, n - i, curr, ans);

        curr.remove(curr.size() - 1);

        find(i + 1, k, n, curr, ans);
    }
}