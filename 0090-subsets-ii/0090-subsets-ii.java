class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        find(0, nums, list, ans);

        return ans;
    }

    public void find(int i, int[] nums, List<Integer> list,
                     List<List<Integer>> ans) {

        if (i == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[i]);
        find(i + 1, nums, list, ans);

        list.remove(list.size() - 1);

        while(i+1<nums.length && nums[i]==nums[i+1]){
            i++;
        }
        find(i + 1, nums, list, ans);
    }
}