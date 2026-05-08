class Solution {
    public int[] productExceptSelf(int[] nums) {
        // example [1 , 2, 4, 6]
        // [48] because 2 * 4 * 6
        // 24 at index 1 because 1 * 4*6
        // [1,  2,  8, 48] l - r
        // [48, 48, 24, 6] r - l
        int[] res = new int[nums.length];

        //calculate prefix at each position and put the prefix in the position
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int pre = res[i - 1];
            res[i] = pre * nums[i - 1];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * postfix;
            postfix *= nums[i];
        }
        return res;
    }
}  
