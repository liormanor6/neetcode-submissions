class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        actual_sum = 0
        predicted_sum = 0
        for i in range(len(nums)):
            actual_sum += nums[i]
            predicted_sum += i+1
        return predicted_sum - actual_sum
