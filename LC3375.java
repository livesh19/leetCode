    // Step 1: If any element is less than k, return -1
    for (int num : nums) {
        if (num < k) return -1;
    }

    int operations = 0;
    while (true) {
        // Check if all elements are equal to k
        boolean allEqualToK = true;
        for (int num : nums) {
            if (num != k) {
                allEqualToK = false;
                break;
            }
        }
        if (allEqualToK) return operations;

        int maxVal = Arrays.stream(nums).max().getAsInt();
        int validH = -1;

        // Search for a valid h
        for (int h = maxVal - 1; h >= k; h--) {
            boolean valid = true;
            int seen = -1;
            for (int num : nums) {
                if (num > h) {
                    if (seen == -1) seen = num;
                    if (num != seen) {
                        valid = false;
                        break;
                    }
                }
            }
            if (valid && seen != -1) {
                validH = h;
                break;
            }
        }

        // If no valid h is found, return -1
        if (validH == -1) return -1;

        // Perform the operation
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > validH) nums[i] = validH;
        }
        operations++;
    }
}