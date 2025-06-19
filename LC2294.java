class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans =1;
        int minValue=nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i]-minValue<=k){
                continue;
            }
            else{
                minValue=nums[i];
                ans++;
            }
        }
        return ans;
    }
}