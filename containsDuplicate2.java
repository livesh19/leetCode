class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int lastIndex=map.getOrDefault(nums[i],0);
            if(map.containsKey(nums[i])){
            if(i-lastIndex<=k)return true;
            }

            map.put(nums[i],i);
        }
        return false;
    }
}