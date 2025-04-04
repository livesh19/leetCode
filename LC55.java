class Solution {
    public boolean canJump(int[] nums) {
      int maxy=0;
      for(int i=0;i<nums.length;i++){
        if(i>maxy)return false;
        maxy = Math.max(maxy,i+nums[i]);
        if(maxy>=nums.length-1)return true;
      }
      return false;
    } 
}