class Solution {
    public int search(int[] nums, int target) {
        int end = nums[nums.length-1];
        int minIndex = 0; // 0
        int maxIndex = nums.length-1; // 6
        while (minIndex <= maxIndex && minIndex >= 0 && maxIndex < nums.length)
        {
            int middleIndex = (maxIndex - minIndex) / 2 + minIndex;
            int middle = nums[middleIndex];
            if (middle == target)
            {
                return middleIndex;
            }
            if (middle < end && target > middle && target <= end)
                minIndex = middleIndex+1;
            else if (middle > end && target <= end)
                minIndex = middleIndex+1;
            else if (middle > end && target > middle)
                minIndex = middleIndex+1;
            else 
                maxIndex = middleIndex-1;
        }
        return -1;
    }
}
