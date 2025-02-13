class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> minHeap=new PriorityQueue<Long>();
        
        for(long num : nums){
            minHeap.add(num);
        }
        return countSteps(minHeap ,k);
    }
    private int countSteps(PriorityQueue<Long> minHeap , int k){
        int count =0;
        while(minHeap.size()>1 && minHeap.peek()<k){
            long a=minHeap.poll();
            long b=minHeap.poll();

            long sum=(a*2)+b;
            minHeap.add(sum);
            count++;
        }
        return count;
    }
}