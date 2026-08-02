class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int numZeros = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0)
            {
                numZeros++;
            }
            else {
                product *= nums[i];
            }
        }

        int[] productExceptSelf = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 0 && numZeros > 1)
            {
                productExceptSelf[i] = 0;
            }
            else if (nums[i] == 0)
            {
                productExceptSelf[i] = product;
            }
            else if (numZeros >= 1){
                productExceptSelf[i] = 0;
            }
            else
            {
                productExceptSelf[i] = product / nums[i];
            }
        }
        return productExceptSelf;
    }
}  
