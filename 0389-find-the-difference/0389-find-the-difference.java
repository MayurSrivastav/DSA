class Solution {
    public char findTheDifference(String s, String t) {
        String add = s+t;
        char ans = 0;
        for(int i=0;i<add.length();i++){
            ans ^= add.charAt(i);
        }
        return ans;
    }
}