class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums) {
            numbers.add(num);
        }
        int longest = 0;

        for (int num : nums) {
            if (!numbers.contains(num-1)) {
                int length = 1;
                while (numbers.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
