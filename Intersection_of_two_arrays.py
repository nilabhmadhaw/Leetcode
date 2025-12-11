class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = set()
        for num in nums1:
            for nmm in nums2:
                if num == nmm:
                    result.add(num)
        return list(result)
        