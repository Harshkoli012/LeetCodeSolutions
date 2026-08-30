class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min=0;
        int max =0;
        for(int i=0;i<n;i++){

            if(nums[i] < nums[min])   min =i;
            if((nums[i]>nums[max])) max =i;
            
        

        }
        int low = Math.min(min,max);
        int high = Math.max(min,max);
        int opt1 = high + 1;
        int opt2 = n -low;
        int opt3 = (low+1) + (n-high);
        return Math.min(opt1,Math.min(opt2,opt3));
    }
}