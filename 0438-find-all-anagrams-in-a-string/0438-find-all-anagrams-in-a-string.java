class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap <Character,Integer> pmap = new HashMap<>();
        HashMap <Character,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        for (char ch : p.toCharArray()) {
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        while(j<s.length()){
            char ch = s.charAt(i);
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
            while (j - i + 1 > p.length()){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
                i++;
            }
            if(pmap.equals(map)){
                list.add(i);
            }
            j++;
        }
        return list;
    }
}