class Solution {
    public int lastStoneWeight(int[] stones) {
        MyComparator comparator = new MyComparator();
        PriorityQueue<Integer> stonesQueue = new PriorityQueue<>(comparator);
        for (int stone: stones)
        {
        stonesQueue.add(stone);
        }
        return recurse(stonesQueue);
    }

    private int recurse(PriorityQueue<Integer> stones)
    {
        if (stones.size() == 0)
        {
            return 0;
        }
        if (stones.size() == 1)
        {
            return stones.peek();
        }
        Integer x = stones.poll();
        Integer y = stones.poll();
        if (x == y)
        {
            return recurse(stones);
        }
        else if (x > y)
        {
            stones.add(x-y);
            return recurse(stones);
        }
        else
        {
            stones.add(y-x);
            return recurse(stones);
        }
    }
}

class MyComparator implements Comparator<Integer>
{
    public int compare(Integer num1, Integer num2)
    {
        if (num1 == num2)
        {
            return 0;
        }
        if (num1 > num2)
        {
            return -1;
        }
        return 1;
    }
}
