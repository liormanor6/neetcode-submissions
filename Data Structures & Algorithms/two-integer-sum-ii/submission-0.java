class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        int[] twoSumIndices = new int[2];

        while (i < j)
        {
            if (numbers[i] + numbers[j] == target)
            {
                twoSumIndices[0] = i + 1;
                twoSumIndices[1] = j + 1;
                break;
            }
            if (numbers[i] + numbers[j] > target)
            {
                j--;
            }
            else 
            {
                i++;
            }
        }
        return twoSumIndices;
    }
}
