class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // Found a valid combination
            return;
        }
        
        if (target < 0) return; // Stop if we exceed the target
        
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose the number
            backtrack(candidates, target - candidates[i], i, current, result); // Reuse the same number
            current.remove(current.size() - 1); // Undo the choice
        }
    }

    
}