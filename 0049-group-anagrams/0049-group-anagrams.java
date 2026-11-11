class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();

        int n = strs.length;
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            arr[i] = new String(ch);
        }

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (vis[i]) continue;

            List<String> list = new ArrayList<>();

            for (int j = i; j < n; j++) {

                if (!vis[j] && arr[i].equals(arr[j])) {
                    list.add(strs[j]);
                    vis[j] = true;
                }
            }

            ans.add(list);
        }

        return ans;
    }
}