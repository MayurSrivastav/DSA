class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []nums = new int[nums1.length+nums2.length];
        int m=nums1.length;
        int n=nums2.length;
        int i=m-1;
        int j=n-1;
        int k =m+n-1;
        int a=m+n;
        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums[k]=nums1[i];
                i--;
                k--;
            }
            else{
                nums[k]=nums2[j];
                j--;
                k--;
            }
        }
        while(i>=0){
            nums[k--]=nums1[i--];
        }
        while(j>=0){
            nums[k--]=nums2[j--];
        }
        if(nums.length%2==0){
            return (nums[(a-1)/2]+nums[a/2])/2.0;
        }
        else{
            return nums[a/2];
        }
    }
}