class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        carry = 1
        n = len(digits)
        for i in range(n-1,-1,-1):
            total = digits[i] + carry
            if total > 9:
                carry = 1
                digits[i] = 0
            else:
                digits[i]  = total
                carry = 0
                break
        if carry == 1:
            digits.insert(0,1)
        return digits
            