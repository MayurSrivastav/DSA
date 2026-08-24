class Solution {
    public List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        find(0, digits, map, "", ans);

        return ans;
    }

    public void find(int i, String digits, String[] map,
                     String curr, List<String> ans) {

        if (i == digits.length()) {
            ans.add(curr);
            return;
        }

        String letters = map[digits.charAt(i) - '0'];

        for (char c : letters.toCharArray()) {
            find(i + 1, digits, map, curr + c, ans);
        }
    }
}