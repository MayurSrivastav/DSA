class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int Aidx = -1;
        int Bidx = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a'){
                Aidx = Math.max(Aidx,i);
            }
            if(ch=='b'){
                Bidx = Math.min(Bidx,i);
            }
        }
        if(Aidx<Bidx){
            return true;
        }
        else{
            return false;
        }
    }
}