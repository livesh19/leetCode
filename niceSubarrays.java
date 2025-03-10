public class niceSubarrays {
    
}
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int total = atMost(nums,k)-atMost(nums,k-1);
        return total;
    }
    private int atMost(int [] nums, int k){
        if(k<0)return 0;
        int l=0 , sum=0, count=0;
        for(int r=0;r<nums.length;r++){
            sum+=(nums[r]%2);
            while(sum>k){
                sum-=(nums[l]%2);
                l++;
            }
            count+=(r-l+1);
        }
        return count;
    }
}