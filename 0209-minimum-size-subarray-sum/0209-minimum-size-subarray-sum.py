class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        n = len(nums)
        sarr = []
        sum = 0
        for i in range(n):
            if nums[i] == target:
                    sarr.append([j])
                    break
            for j in range(i+1):
                if nums[i] + nums[j] == target:
                    sarr.append([i,j])
        return len(sarr)