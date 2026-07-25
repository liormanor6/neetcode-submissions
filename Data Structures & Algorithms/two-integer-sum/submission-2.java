class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> missingToIndex = new HashMap<>(nums.length);

        // O(n)
        for (int i = 0; i < nums.length; i++)
        {
            missingToIndex.put(target - nums[i], i);
        }

        // O(n)
        for (int i = 0; i < nums.length; i++)
        {
            // O(1)
            if (missingToIndex.get(nums[i]) != null)
            {
                if (i == missingToIndex.get(nums[i]))
                    continue;
                int[] indices = {i, missingToIndex.get(nums[i])};
                Arrays.sort(indices);
                return indices;
            }
        }
        return new int[2];
    }
}
