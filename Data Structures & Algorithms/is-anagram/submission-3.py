class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sorted_text_a = "".join(sorted(s))
        sorted_text_b = "".join(sorted(t))
        return (sorted_text_a == sorted_text_b)
        