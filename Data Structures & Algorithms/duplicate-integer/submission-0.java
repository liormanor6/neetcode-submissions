class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();

       for (int i = 0; i < nums.length; i++)
       {
        boolean inSetAlready = set.add(nums[i]);
        if (!inSetAlready)
        {
            return true;
        }
       }
       return false;
    }
}