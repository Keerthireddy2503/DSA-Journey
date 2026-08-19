class Solution {
    public int minimumSwaps(int[] nums) {
        int nonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nonZero++;
            }
        }
        int swaps = 0;
        for (int i = 0; i < nonZero; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }
        return swaps;
    }
}