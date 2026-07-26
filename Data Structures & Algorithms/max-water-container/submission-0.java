class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = -1;
        while (left < right)
        {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            int currArea = Math.min(leftHeight, rightHeight) * (right-left);
            if (currArea > maxArea)
            {
                maxArea = currArea;
            }
            if (leftHeight < rightHeight)
            {
                left++;
            }
            else if (leftHeight > rightHeight)
            {
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        return maxArea;
    }
}
