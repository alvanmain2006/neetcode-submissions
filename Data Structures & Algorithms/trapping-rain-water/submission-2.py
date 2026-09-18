class Solution:
    def trap(self, height: List[int]) -> int:
        # min left and min right of a pillar can tell how much water we have
        # minHeight - maxHeight - pillarHeight
        # you can make 3 arrays and calculate each max min height at each pillar, then calculate the total
        if not height: return 0
        res = 0
        l, r = 0, len(height) - 1
        maxL = height[l]
        maxR = height[r]

        while l < r:
            
            if maxL <= maxR:
                l += 1
                maxL = max(height[l], maxL)
                res += maxL - height[l]
            else:
                r -= 1
                maxR = max(height[r], maxR)
                res += maxR - height[r]

        return res