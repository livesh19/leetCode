class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue <Integer> heap  = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for(int num : nums){
            heap.add(num);
        }
        int maxHeap = 0;
        while(k!=0){
            maxHeap=heap.poll();
            k--;
        }
        return maxHeap;
    }
}