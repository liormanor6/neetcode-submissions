class Solution {
    public int search(int[] nums, int target) {
        int min = 0; 
        int max = nums.length - 1;

        while (min < max)
        {
            int middle = ((max - min) / 2) + min;
            if (nums[middle] == target)
            {
                return middle;
            }
            else if (nums[middle] < target)
            {
                min = middle + 1;
            }
            else {
                max = middle - 1;
            }
        }
        if (nums[min] == target)
        {
            return min;
        }
        return -1;
    }
}
