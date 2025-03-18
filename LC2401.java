class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, bitwiseMask = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            while ((bitwiseMask & nums[right]) != 0) {
                bitwiseMask ^= nums[left]; 
                left++;
            }
            bitwiseMask |= nums[right]; 
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}