class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] ls = new int[128];
        Arrays.fill(ls, -1);
        
        int maxLength = 0;
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currChar = s.charAt(right);
            
            if (ls[currChar] >= left) {
                left = ls[currChar] + 1;
            }
            
            ls[currChar] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
        
    }
}