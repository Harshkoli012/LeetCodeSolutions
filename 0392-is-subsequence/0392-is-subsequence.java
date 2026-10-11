class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        int count = 0;

        while(j<t.length()){
            if(i<s.length() && s.charAt(i) == t.charAt(j)){
                i++;
                j++;
                count ++;
            }
            else{
                j++;

            }
            if(count == s.length()){
                return true;
            }
        }
        return count == s.length();

        
    }
} 