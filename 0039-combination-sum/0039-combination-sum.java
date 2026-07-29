class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        
        int[] path = new int[target + 1]; 
        
        backtrack(candidates, target, 0, path, 0, result);
        return result;
    }

    private void backtrack(int[] candidates, int remain, int start, int[] path, int len, List<List<Integer>> result) {
        if (remain == 0) {
            
            List<Integer> validComb = new ArrayList<>(len);
            for (int i = 0; i < len; i++) {
                validComb.add(path[i]);
            }
            result.add(validComb);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] > remain) {
                break; 
            }

            path[len] = candidates[i]; 
            backtrack(candidates, remain - candidates[i], i, path, len + 1, result);
        }
    }
}