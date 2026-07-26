class Solution {
    public int search(int[] nums, int target) {
        int min = 0; 
        int max = nums.length - 1;

        while (min <= max)
        {
            int middle = ((max - min) / 2) + min;
            int middleValue = nums[middle];
            if (middleValue == target)
            {
                return middle;
            }
            else if (middleValue < target)
            {
                min = middle + 1;
            }
            else {
                max = middle - 1;
            }
        }
        return -1;
    }
}
