class Solution:
    def maxArea(self, heights: List[int]) -> int:
        bestWater = 0

        l, r = 0, len(heights) - 1

        while l <= r:
            minHeight = min(heights[l], heights[r])
            curWater = (r - l) * minHeight
            bestWater = max(bestWater, curWater)

            if heights[l] < heights[r]:
                l += 1
            else:
                r -= 1
        return bestWater