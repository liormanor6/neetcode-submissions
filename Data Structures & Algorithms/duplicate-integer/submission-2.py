class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        map = {}
        for num in nums:
            if map.get(num, 0) != 0:
                return True
            else:
                map[num] = 1
        return False

        
        