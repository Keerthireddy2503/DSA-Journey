class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int left=0;
        int right=0;
        int count=0;
        int product=1;
        while(left<nums.length){
           product*=nums[left];
            while(right<=left && product>=k){
               product/=nums[right];
               right++;
            }
            count+=left-right+1;
            left++;
        }
        return count;
    }
}