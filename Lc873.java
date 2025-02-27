class Solution {
    public int lenLongestFibSubseq(int[] arr) {
           int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }
        
        Map<Integer, Integer> dp = new HashMap<>();
        int maxLength = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int x = arr[j], y = arr[i];
                int prev = x + y;
                if (indexMap.containsKey(prev)) {
                    int k = indexMap.get(prev);
                    int length = dp.getOrDefault(j * n + i, 2) + 1;
                    dp.put(i * n + k, length);
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        
        return maxLength >= 3 ? maxLength : 0;
    }
}

