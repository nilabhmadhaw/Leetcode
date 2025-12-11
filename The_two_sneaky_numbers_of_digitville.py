class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        newList = []
        l = len(nums)
        for i in range(l):
            for j in range(i+1,l):
                if nums[i] == nums[j] and nums[j] not in newList:
                    newList.append(nums[i])
        return newList