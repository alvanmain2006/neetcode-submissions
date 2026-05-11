class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int count = 0;
                while (numSet.contains(num + count)) {
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
