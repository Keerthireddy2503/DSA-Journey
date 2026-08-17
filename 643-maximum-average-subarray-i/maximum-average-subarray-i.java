class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                max = Math.max(max,sum);
            }
            right++;
        }
        return (double)max/k;
    }
}