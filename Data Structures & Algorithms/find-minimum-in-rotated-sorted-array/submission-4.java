class Solution {
    public int findMin(int[] nums) {
        int minIndex = 0;
        int maxIndex = nums.length - 1;

        while (minIndex < maxIndex)
        {
            int middleIndex = (maxIndex - minIndex) / 2 + minIndex;

            if (nums[middleIndex] < nums[maxIndex])
            {
                maxIndex = middleIndex;
            }
            else 
            {
                minIndex = middleIndex + 1;
            }
        }
        return nums[minIndex];
    }
}
