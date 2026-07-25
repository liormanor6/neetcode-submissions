class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> missingToIndex = new HashMap<>(nums.length);

        // O(n)
        for (int i = 0; i < nums.length; i++)
        {
            if(missingToIndex.get(nums[i]) != null)
            {
                int[] indices = {missingToIndex.get(nums[i]), i};
                return indices;
            }
            missingToIndex.put(target - nums[i], i);
        }
        return new int[2];
    }
}
