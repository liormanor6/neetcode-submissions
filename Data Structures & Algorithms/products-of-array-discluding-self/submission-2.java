class Solution {
    public int[] productExceptSelf(int[] nums) {
                int[] prefixArray = new int[nums.length];
        prefixArray[0] = 1;
        for (int i = 1; i < nums.length; i++)
        {
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        int[] postArray = new int[nums.length];
        postArray[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--)
        {
            postArray[i] = postArray[i+1] * nums[i+1];
        }
        int[] products = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            products[i] = prefixArray[i] * postArray[i];
        }

        return products;
    }
}  
