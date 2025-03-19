class Solution {
    public int minOperations(int[] nums) {
        int res =0;

        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==0){
            nums[i]^=1;
            nums[i+1]^=1;
            nums[i+2]^=1;
            res++;
            }
        }

        for(int i=nums.length-2;i<nums.length;i++){
            if(i>=0 && nums[i]==0){
                return -1;
            }
        }
        return res;
    }
}