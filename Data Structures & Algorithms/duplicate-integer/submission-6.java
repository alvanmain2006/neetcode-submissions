class Solution {
    public boolean hasDuplicate(int[] nums) {
        // return true if any value appear more than once
        // this is a hashing, array problems
        // usually we think we can double loop through
        // but we can use a set since, it cant contain dup
        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!check.add(nums[i])) {
                return true;
            }
            check.add(nums[i]);
        }
        return false;
    }
}