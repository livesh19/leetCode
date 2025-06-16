class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int t=nums.length/3;
        for(int i =0;i<nums.length;i++){
            // System.out.println(map.get(nums[i]));
            if(map.get(nums[i])>t && !ans.contains(nums[i])){
                ans.add(nums[i]);
            }
        }
        return ans;
    }
}