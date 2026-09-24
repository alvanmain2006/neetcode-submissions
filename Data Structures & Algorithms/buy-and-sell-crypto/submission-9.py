class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        l, r = 0, 1
        bestPro = 0

        while r < len(prices):
            bestPro = max(bestPro, prices[r] - prices[l])
            if prices[l] > prices[r]:
                l = r
            else:
                r += 1
        return bestPro

        