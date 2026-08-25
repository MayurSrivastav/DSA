import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        find(nums.length, map, list, ans);

        return ans;
    }

    public void find(int n,HashMap<Integer, Integer> map,List<Integer> list,List<List<Integer>>ans) {

        if (list.size() == n) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int x : map.keySet()) {

            if (map.get(x) == 0) {
                continue;
            }

            list.add(x);
            map.put(x, map.get(x) - 1);

            find(n, map, list, ans);

            map.put(x, map.get(x) + 1);
            list.remove(list.size() - 1);
        }
    }
}