class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        nums_sum = 0
        for i in range(0, len(nums)-1, 2):
            nums_sum += nums[i]
        return nums_sum
        