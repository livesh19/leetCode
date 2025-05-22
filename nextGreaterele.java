import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        Stack<Integer> stk = new Stack<>(); 

       
        for (int num : nums2) {
            while (!stk.isEmpty() && stk.peek() < num) {
                map.put(stk.pop(), num);
            }
            stk.push(num);
        }

       
        while (!stk.isEmpty()) {
            map.put(stk.pop(), -1);
        }

      
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
