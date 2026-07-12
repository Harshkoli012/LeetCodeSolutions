class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 =  new HashSet<>();
        for(int num : nums1){
            s1.add(num);
        }

        Set<Integer> result = new HashSet<>();
        for(int num : nums2){
            if(s1.contains(num)){
                result.add(num);
            }
        }

        int[] output = new int [result.size()];
        int i=0;
        for(int num :result){
            output[i] = num;
            i++;
        }
        return output;




        
    }
}