class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int minRow = 0;
        int maxRow = matrix.length - 1;
        int middleRow = (maxRow-minRow) / 2;
        int minCol = 0;
        int maxCol = matrix[maxRow].length - 1;
        while (minRow <= maxRow)
        {
            middleRow = ((maxRow - minRow) / 2) + minRow;
            if (target >= matrix[middleRow][minCol] 
                && target <= matrix[middleRow][maxCol])
            {
                return BinarySearch(matrix[middleRow], target);
            }
            else if (target > matrix[middleRow][maxCol])
            {
                minRow = middleRow + 1;
            }
            else {
                maxRow = middleRow - 1;
            }
        }
        return false;
    }
    public boolean BinarySearch(int[] nums, int target)
    {
        int min = 0; 
        int max = nums.length - 1;

        while (min <= max)
        {
            int middle = ((max - min) / 2) + min;
            int middleValue = nums[middle];
            if (middleValue == target)
            {
                return true;
            }
            else if (middleValue < target)
            {
                min = middle + 1;
            }
            else {
                max = middle - 1;
            }
        }
        return false;
    }
}
