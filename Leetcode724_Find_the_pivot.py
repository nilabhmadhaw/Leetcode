class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        lsum = 0
        tsum = sum(nums)
        for i in range(len(nums)):
            rsum = tsum - lsum - nums[i]
            if(lsum == rsum):
                return i
            else:
                lsum+=nums[i]
        return -1