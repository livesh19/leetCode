class Solution {
    public int jump(int[] nums) {
        int maxReach = 0; 
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return 0; 
            maxReach = Math.max(maxReach, i + nums[i]);
            if(maxReach>0)
                count+=1;
            if (maxReach >= nums.length - 1) 
                return count;
        }
        
        return 0;
    }
}