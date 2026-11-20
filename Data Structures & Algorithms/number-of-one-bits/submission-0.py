class Solution:
    def hammingWeight(self, n: int) -> int:
        binary = bin(n)
        binary = binary.strip('0b')
        return str(binary).count('1')