class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        """tMap = {}
        sMap = {}

        if len(s) != len(t):
            return False
        
        for i in range(len(s)):
            tMap[t[i]] = 1 + tMap.get(t[i], 0)
            sMap[s[i]] = 1 + sMap.get(s[i], 0)
        
        return tMap == sMap
        """
        if len(s) != len(t):
            return False
        
        count = [0] * 26
        for i in range(len(s)):
            count[ord(s[i]) - ord("a")] += 1
            count[ord(t[i]) - ord("a")] -= 1

        for val in count:
            if val != 0:
                return False
        return True