class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        merged = []
        pointer1 = 0
        pointer2 = 0
        nums1_len = len(nums1)
        nums2_len = len(nums2)
        half = (nums1_len + nums2_len) // 2 + 1
        while (len(merged) < half and
                pointer1 in range(nums1_len) and
                pointer2 in range(nums2_len)):
            if nums1[pointer1] < nums2[pointer2]:
                merged.append(nums1[pointer1])
                pointer1 += 1
            else:
                merged.append(nums2[pointer2])
                pointer2 += 1
    
        if pointer1 >= nums1_len:
            while len(merged) < half:
                merged.append(nums2[pointer2])
                pointer2 += 1
        else:
            while len(merged) < half:
                merged.append(nums1[pointer1])
                pointer1 += 1
        if (nums1_len + nums2_len) % 2 == 1:
            return merged[half-1]
        return (merged[half-1] + merged[half-2]) / 2

