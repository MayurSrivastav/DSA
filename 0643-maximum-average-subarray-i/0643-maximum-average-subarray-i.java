class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        int max = sum;
        int i=0;
        int j=k;
        while(j<nums.length){
            sum = sum + nums[j];
            sum = sum - nums[i];
            i++;
            j++;
            max = Math.max(max,sum);
        }
        return (double)max/k;
    }
}