class Solution {
    public int maximumSum(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       int maxNum=0;
       for(int num : nums){
        int sum=sumOfDigit(num);
        if(map.containsKey(sum)){
           maxNum = Math.max(maxNum,(num+map.get(sum)));
           map.put(sum,Math.max(num, map.get(sum)));
        }
        else{
            map.put(sum,num);
        }
       }
       if(maxNum==0){
          return -1;
       }
       return maxNum;
    }
    private int sumOfDigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
