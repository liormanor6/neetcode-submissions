class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(new MyComparator());

        for (int[] point : points)
        {
            queue.add(point);
        }

        if (queue.size() > k)
        {
            int size = queue.size();
            for(int i = 0; i < size - k; i++)
            {
                queue.poll();
            }
        }
        int[][] kClosest = new int[queue.size()][2];
        int i = 0;
        for (int[] point : queue) {
            kClosest[i++] = point;
        }
        return kClosest;
    }

}

class MyComparator implements Comparator<int[]> 
{
    public int compare(int[] point1, int[] point2)
    {
        double point1DistToOrigin = Math.sqrt((double)Math.pow(point1[0], 2) + Math.pow(point1[1], 2));
        double point2DistToOrigin = Math.sqrt((double)Math.pow(point2[0], 2) + Math.pow(point2[1], 2));
        if (point1DistToOrigin < point2DistToOrigin)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}
