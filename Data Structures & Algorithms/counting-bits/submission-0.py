class Solution:
    def countBits(self, n: int) -> List[int]:
        list = [a for a in range(n+1)]
        list = [str(bin(a).strip('0b')).count('1') for a in list]
        return list
        