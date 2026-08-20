class Solution {
    public List<List<Integer>> permute(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        find(n,arr,list,ans);
        return ans;
    }
    public static void find(int n,int[] arr,List<Integer> list,List<List<Integer>> ans){
        if(list.size()==arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int x : arr){
            if(list.contains(x)){
                continue;
            }
            list.add(x);
            find(n,arr,list,ans);
            list.remove(list.size()-1);
        }
    }
}