class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int leftNum = numbers[l];
            int rightNum = numbers[r];
            int curSum = leftNum + rightNum;
            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }
        return new int[0];
    }
}
