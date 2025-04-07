class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low = 1, high = 0;
        
        for (int candy : candies) {
            high = Math.max(high, candy);
        }
        
        int result = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canDistribute(candies, mid, k)) {
                result = mid;
                low = mid + 1;  // Try to maximize `mid`
            } else {
                high = mid - 1;
            }
        }
        
        return result;
    }

    private boolean canDistribute(int[] candies, int mid, long k) {
        if (mid == 0) return false;
        
        long count = 0;  
        for (int candy : candies) {
            count += candy / mid; 
            if (count >= k) return true; 
        }
        
        return count >= k;
        
    }
}