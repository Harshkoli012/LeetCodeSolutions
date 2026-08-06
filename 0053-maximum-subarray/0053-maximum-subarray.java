class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int combinedSum = currentMax + nums[i];
                        if (nums[i] > combinedSum) {
                currentMax = nums[i];
            } else {
                currentMax = combinedSum;
            }
                        if (currentMax > maxSoFar) {
                maxSoFar = currentMax;
            }
        }
        
        return maxSoFar;
    }
}