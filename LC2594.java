import java.util.Arrays;

class Solution {
    public long repairCars(int[] ranks, int cars) {
        Arrays.sort(ranks); // Sorting mechanics by efficiency
        long left = 1, right = (long) ranks[0] * cars * cars, result = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            if (canRepairAllCars(ranks, cars, mid)) {
                result = mid;
                right = mid - 1; // Try to minimize the time
            } else {
                left = mid + 1; // Increase time if cars can't be repaired
            }
        }
        return result;
    }

    private boolean canRepairAllCars(int[] ranks, int cars, long maxTime) {
        int repairedCars = 0;
        for (int rank : ranks) {
            long n = 0, time = 0;
            while (time + rank * (n + 1) * (n + 1) <= maxTime) {
                n++;
                time = rank * n * n;
                repairedCars++;
                if (repairedCars >= cars) return true; // Stop early if all cars are repaired
            }
        }
        return repairedCars >= cars;
    }
}
