class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // given list of strings, return a list of lists of anagram strings
        // you can short each strings by chars, then put the one that are the same
        // you can create array of 26 x 0 length to store the freq of each word
        // any words with the same freq can get group together
        Map<String, List<String>> count = new HashMap<>();
        
        for (String s : strs) {
            int[] freq = new int[26];
            for (Character c : s.toCharArray()) {
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
            count.putIfAbsent(key, new ArrayList<>());
            count.get(key).add(s);
        }
        return new ArrayList<>(count.values());
    }
}

