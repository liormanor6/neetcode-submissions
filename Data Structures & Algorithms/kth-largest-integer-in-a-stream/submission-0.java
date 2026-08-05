class KthLargest {

    PriorityQueue<Integer> allElements;
    PriorityQueue<Integer> topK;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        allElements = new PriorityQueue<>();
        topK = new PriorityQueue<>();
        for (int num : nums)
        {
            add(num);
        }
    }
    
    public int add(int val) {
        allElements.add(val);

        topK.add(val);
        if (topK.size() > k)
        {
            topK.poll();
        }
        return topK.peek();
    }
}
