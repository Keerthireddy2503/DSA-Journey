class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int freq[] = new int[100000+1];
        int distinct=0;
        long sum=0;
        long maxsum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
            if(freq[nums[i]]==0){
                distinct++;
            }
            freq[nums[i]]++;
            
        }
            if(distinct==k){
                maxsum=sum;
            }
        for(int i=k;i<nums.length;i++){
            sum+=nums[i];
             if(freq[nums[i]]==0){
                distinct++;
            }
            freq[nums[i]]++;

            sum-=nums[i-k];
            freq[nums[i-k]]--;
            if(freq[nums[i-k]]==0){
                distinct--;
            }

            if(distinct==k){
                maxsum=Math.max(maxsum,sum);
             }
        }
        return maxsum;
    }
}