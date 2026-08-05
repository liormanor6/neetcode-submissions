class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int num : nums)
        {
            queue.add(num);
        }

        int size = queue.size();
        for (int i = 0; i < size - k; i++)
        {
            queue.poll();
        }

        return queue.peek();
    }
}
