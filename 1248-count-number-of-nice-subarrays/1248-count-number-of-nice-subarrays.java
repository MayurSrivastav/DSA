class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                prefix++;
            }

            int need = prefix - k;

            if (map.containsKey(need)) {
                count += map.get(need);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}