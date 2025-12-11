class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        q = x 
        result = 0
        while(q!=0):
            remainder = q%10
            result = result*10 + remainder
            q = q//10
        return result == x