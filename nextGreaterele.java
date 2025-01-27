import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(); // Store next greater elements
        Stack<Integer> stk = new Stack<>(); // Monotonic decreasing stack

        // Traverse nums2 to determine next greater elements
        for (int num : nums2) {
            while (!stk.isEmpty() && stk.peek() < num) {
                map.put(stk.pop(), num);
            }
            stk.push(num);
        }

        // Remaining elements in stack have no greater element
        while (!stk.isEmpty()) {
            map.put(stk.pop(), -1);
        }

        // Build the result array for nums1
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
