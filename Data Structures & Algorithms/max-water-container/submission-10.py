class Solution:
    def maxArea(self, heights: List[int]) -> int:
        l, r = 0, len(heights) - 1
        maxSoFar = 0

        while l < r:
            area = min(heights[l], heights[r]) * (r - l)
            maxSoFar = max(maxSoFar, area)
            if heights[l] <= heights[r]:
                l += 1
            else:
                r -= 1
        return maxSoFar