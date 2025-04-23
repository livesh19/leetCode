class Solution {
    public int countLargestGroup(int n) {
         Map<Integer, Integer> groupMap = new HashMap<>();
        
        // Iterate over numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            groupMap.put(sum, groupMap.getOrDefault(sum, 0) + 1);
        }
        
        // Find the largest group size
        int maxSize = 0;
        for (int size : groupMap.values()) {
            maxSize = Math.max(maxSize, size);
        }
        
        // Count the groups with the largest size
        int count = 0;
        for (int size : groupMap.values()) {
            if (size == maxSize) {
                count++;
            }
        }
        
        return count;
    }
     private int digitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

}