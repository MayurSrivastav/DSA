class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> need = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        int i = 0;
        int j = 0;
        int formed = 0;
        int required = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (j < s.length()) {
            char c = s.charAt(j);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (need.containsKey(c) && window.get(c) <= need.get(c)) {
                formed++;
            }
            j++;
            while (formed == required) {
                if (j - i < minLen) {
                    minLen = j - i;
                    start = i;
                }
                char left = s.charAt(i);
                window.put(left, window.get(left) - 1);
                if (need.containsKey(left)
                        && window.get(left) < need.get(left)) {
                    formed--;
                }
                i++;
            }
        }
        if (minLen == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start, start + minLen);
    }
}