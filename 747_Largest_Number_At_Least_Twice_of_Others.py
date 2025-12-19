class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        largest = max(nums)
        largest_index = nums.index(largest)
        for i in range(len(nums)):
            if(i==largest_index):
                continue
            if(largest < 2*nums[i]):
                    return -1
        return largest_index
                