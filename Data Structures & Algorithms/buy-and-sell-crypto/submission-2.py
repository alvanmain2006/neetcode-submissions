class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        buy, sell = 0, 1
        
        while sell < len(prices):
            curProfit = prices[sell] -prices[buy]
            maxProfit = max(maxProfit, curProfit)
            if prices[buy] > prices[sell]:
                buy = sell
            sell += 1
        return maxProfit