class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0)
        {
            return 0;
        }
        int longestConseq = 1;
        int currConseq = 1;
        for (int i = 0; i < nums.length-1; i++)
        {
            if ((nums[i] + 1) == nums[i+1])
            {
                currConseq++;
            }
            else if (nums[i] != nums[i + 1])
            {
                currConseq = 1;
            }
            if (currConseq > longestConseq)
            {
                longestConseq = currConseq;
            }
        }
        return longestConseq;
    }
}
