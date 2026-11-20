class Solution:
    def hammingWeight(self, n: int) -> int:
        return str(bin(n).strip('0b')).count('1')