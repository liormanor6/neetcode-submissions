class Solution:
    def isHappy(self, n: int) -> bool:
        sums = set()
        result = 0
        while n != 1 and n not in sums:
            sums.add(n)
            result = 0
            for digit in str(n):
                result += int(digit) ** 2
            n = result
        return n == 1