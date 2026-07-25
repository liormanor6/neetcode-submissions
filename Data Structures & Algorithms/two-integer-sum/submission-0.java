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
                int index1 = missingToIndex.get(nums[i]);
                if (i == index1)
                    continue;
                int[] indices = {i, index1};
                // Only happens once, so O(1)
                Arrays.sort(indices);
                return indices;
            }
        }
        int[] empty = new int[2];
        return empty;
    }
}
