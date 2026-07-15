class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] hash = new int[26];
        for(char c: p.toCharArray() ){
            hash[c - 'a'] ++;

        } 
        int start=0;
        int end=0;
        while(end<s.length()){
            if(hash[s.charAt(end) - 'a']>=1){
                hash[s.charAt(end) - 'a']--;
                end++;
                if(end==start +p.length()){
                    ans.add(start);
                }
            }
            else if(start==end){
                start++;
                end++;
            }else{
                hash[s.charAt(start)-'a']++;
                start++;
            }
        }

        
        return ans;
    }
}