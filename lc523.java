class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
       boolean flag=false;
       HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
       set.put(0,-1);
       int cumSum=0;
       for(int i=0;i<nums.length;i++){
        cumSum=(cumSum+nums[i])%k;
        if (cumSum < 0) {
            cumSum += k;
        }
        if(nums.length==2){
            
        }
        if(set.containsKey(cumSum) && nums.length>1){
            if((i+1)-set.get(cumSum)>=2){
                flag=true;
                break;
            }
        }
        else{
            set.put(cumSum,i);
        }
       }
       return flag;
    }
}