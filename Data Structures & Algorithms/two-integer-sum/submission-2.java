class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brute force
        //o(n^2) and o(1)
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};

        //Better solution
        //O(n) and O(n)
        HashMap<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (numToIndex.containsKey(diff)) {
                return new int[] {numToIndex.get(diff), i};
            }
            numToIndex.put(num, i);
        }
    return new int[]{};

    }
}
