class Solution {
    public int[] twoSum(int[] nums, int target) {
       // give an array number and target number
       // return any two number that add up to target, but return indicies only
       // we could use a double loop to find, but we can use a hashmap 
       // to store the each number and its difference\\

       HashMap<Integer, Integer> seen = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (seen.containsKey(nums[i])) {
                return new int[] {seen.get(nums[i]), i};
            }
            seen.put(difference, i);
       } 
       return new int[] {};
    }
}
