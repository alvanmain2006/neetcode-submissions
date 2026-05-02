class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        

        for s in strs:
            count = [0] * 26
            for c in s:
                count[ord(c) - ord('a')] += 1
            
            #in python list cant be a key in hashmap because it is mutable, so change to tuple
            res[tuple(count)].append(s)
        
        return list(res.values())