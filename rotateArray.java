class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;   
        // divide and conquer method 
        reverse(nums, 0, nums.length - 1); 
        reverse(nums, 0, k - 1); 
        reverse(nums, k, nums.length - 1);  
    }
    // reverse array function
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
