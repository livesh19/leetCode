class Solution {
    public int[] plusOne(int[] digits) {
          int n = digits.length;
        
        // Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {  // If digit is not 9, just add 1 and return
                digits[i]++;
                return digits;
            }
            // If digit is 9, turn it into 0 and continue
            digits[i] = 0;
        }

        // If all digits were 9 (e.g., 999 → 1000), create a new array
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // First digit is 1, rest are 0s (default)
        return newDigits;
    }
}