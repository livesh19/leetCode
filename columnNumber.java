class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;  // Adjust for 1-based indexing
            char ch = (char) ('A' + (columnNumber % 26)); // Get corresponding letter
            result.append(ch);
            columnNumber /= 26;
        }

        return result.reverse().toString();
    }
}