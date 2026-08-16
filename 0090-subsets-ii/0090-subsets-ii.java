class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        find(0, nums, list, ans);

        return ans;
    }

    public void find(int i, int[] nums, List<Integer> list,List<List<Integer>> ans) {

        ans.add(new ArrayList<>(list));

        for (int j = i; j < nums.length; j++) {

            if (j > i && nums[j] == nums[j - 1]) {
                continue;
            }

            list.add(nums[j]);

            find(j + 1, nums, list, ans);

            list.remove(list.size() - 1);
        }
    }
}