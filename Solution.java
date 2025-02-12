public class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int left=0;
        int right=1;

        while(right<prices.length){
            if(prices[left]<prices[right]){
                maxP=Math.max(maxP,(prices[right]-prices[left]));
            }
            else{
                left=right;
            }
            right++;
        }
        return maxP;
    }
} {
    
}
