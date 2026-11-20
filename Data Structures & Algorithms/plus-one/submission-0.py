class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        result = 0
        for i in range(len(digits)):
            result += (10 ** (n-i-1) * digits[i])
        result += 1
        return [int(d) for d in str(result)]

        