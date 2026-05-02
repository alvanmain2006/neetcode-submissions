class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = [c.lower() for c in s if c.isalnum()]
        r = 0
        l = len(s) - 1
        while r < l:
            if s[r] != s[l]:
                return False
            r += 1
            l -= 1
        return True