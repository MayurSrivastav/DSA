class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character,Integer> map = new HashMap<>();
        HashMap <Character,Integer> ans = new HashMap<>();
        for(char c: s1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int i=0;
        int j=0;
        while(j<s2.length()){
            char ch = s2.charAt(j);
            char a = s2.charAt(i);
            ans.put(ch,ans.getOrDefault(ch,0)+1);
            while (j - i + 1 > s1.length()){
                ans.put(a,ans.get(a)-1);
                if (ans.get(a) == 0) {
                    ans.remove(a);
                }
                i++;
            }
            if(ans.equals(map)){
                return true;
            }
            j++;
        }
    return false;
    }
}