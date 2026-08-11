class Solution {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.trim().split("\\s+"));
        int i=0;
        int j=words.size()-1;
        while(i<=j){
            String temp = words.get(i);
            words.set(i, words.get(j));
            words.set(j, temp);
            i++;
            j--;
        }
        s = String.join(" ", words);
        return s;
    }
}