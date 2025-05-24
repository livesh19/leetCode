
    for (int num : nums) {
        if (num < k) return -1;
    }

    int operations = 0;
    while (true) {
      
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

     
        if (validH == -1) return -1;

        // Perform the operation
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > validH) nums[i] = validH;
        }
        operations++;
    }
}