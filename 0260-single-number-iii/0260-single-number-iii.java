class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num : nums){
            xor= xor^num;
        }
        int xorA = 0;
        int xorB = 0;
        int rsb = xor & (-xor);
        for(int num:nums){
            if((rsb & num) != 0){
                xorA = xorA^num;
            }
            else{
                xorB = xorB^num;
            }
        }
    return new int[]{xorA,xorB};
    }
}