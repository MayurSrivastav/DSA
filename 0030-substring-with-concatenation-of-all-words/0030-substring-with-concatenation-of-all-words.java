class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> Gmap = new HashMap<>();
        HashMap<String, Integer> Rmap = new HashMap<>();
        int m = words.length;
        int len = words[0].length();
        int n = s.length();
        for (int i = 0; i < m; i++) {
            Gmap.put(words[i], Gmap.getOrDefault(words[i], 0) + 1);
        }
        for (int start = 0; start < len; start++) {
            int l = start;
            int r = start;
            Rmap.clear();
            while (r + len <= n) {
                String w = s.substring(r, r + len);
                r += len;
                if (Gmap.containsKey(w)) {
                    Rmap.put(w, Rmap.getOrDefault(w, 0) + 1);
                    while (Rmap.get(w) > Gmap.get(w)) {
                        String leftWord = s.substring(l, l + len);
                        Rmap.put(leftWord, Rmap.get(leftWord) - 1);
                        l += len;
                    }
                    if (Gmap.equals(Rmap)) {
                        list.add(l);
                    }
                } else {
                    Rmap.clear();
                    l = r;
                }
            }
        }
        return list;
    }
}