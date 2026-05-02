class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0] * len(nums)
        n = len(nums)
        pre = 1
        postfix = 1
        for i in range(n):
            res[i] = pre
            pre = pre * nums[i]
        for i in range(n - 1, -1, -1):
            res[i] = postfix * res[i]
            postfix *= nums[i]

        return res