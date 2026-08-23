class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int unqC=map.size();
        int str=0;
        int e=0;
        int siz = Integer.MAX_VALUE;
        int start=-1;
        while(e<s.length()){
            char c = s.charAt(e);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    unqC--;
                }   
            }
            while(unqC==0){
                int len=e-str+1;
                if(len<siz){
                    siz=len;
                    start=str;
                }
                char a = s.charAt(str);
                if(map.containsKey(a)){
                    map.put(a,map.get(a)+1);
                    if(map.get(a)>0){
                        unqC++;
                    }   
                }
                str++;
            } 
        e++; 
        }
    if(start==-1){
        return "";
    }
    return s.substring(start,start+siz);
    }
}