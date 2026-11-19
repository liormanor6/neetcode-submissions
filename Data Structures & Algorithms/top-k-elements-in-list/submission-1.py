class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequencies = {}
        for i in range(len(nums)):
            num = nums[i]
            frequencies[num] = frequencies.get(num, 0) + 1
        keys_list = frequencies.keys()
        val_list = frequencies.values()
        sorted_vals, sorted_keys = zip(*sorted(zip(val_list, keys_list)))
        sorted_keys_list = list(sorted_keys)
        length = len(sorted_keys_list)
        return [sorted_keys_list[i] for i in range(length-k, length, 1)]
            


        