class Solution {
    public int findMin(int[] nums) {
        int firstValue = nums[0];

        int minIndex = 0;
        int maxIndex = nums.length - 1;

        while (minIndex < maxIndex)
        {
            int middleIndex = (maxIndex - minIndex) / 2 + minIndex;

            if (nums[middleIndex] < firstValue)
            {
                maxIndex = middleIndex;
            }
            else 
            {
                minIndex = middleIndex + 1;
            }
        }
        if (nums[minIndex] < firstValue)
        {
            return nums[minIndex];
        }
        return firstValue;
    }
}
