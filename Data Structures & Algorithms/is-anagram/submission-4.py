class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map_a = {}
        map_b = {}
        for char in s:
            map_a[char] = map_a.get(char,0) + 1
        for char in t:
            map_b[char] = map_b.get(char,0) + 1
        return (map_a == map_b)
        
        