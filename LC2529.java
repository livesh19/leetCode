class Solution {
    public int maximumCount(int[] nums) {
        int negCount =0;
        int posCount=0;
        int max =0;
        for(int num: nums){
            if(num>0&&num!=0){
                posCount++;
            }
            else if(num<0){
                negCount++;
            }
            max=Math.max(posCount,negCount);
        }
        return max;
    }
}