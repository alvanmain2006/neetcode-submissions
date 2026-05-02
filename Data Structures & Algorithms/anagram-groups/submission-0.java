class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // HashMap<char[], List<String>> charToStrs = new HashMap<>();
        // for (int i = 0; i < strs.length; i++) {
        //     char[] curSort = strs[i].toCharArray();
        //     Arrays.sort(curSort);
        //     charToStrs.put(curSort, new ArrayList<>());
        //     if (curSort.)
        //     charToStrs.get(curSort).add(strs[i]);
        // }
        //i got the right idea for sorting but this is brute force
        // and this is the better code for the brute force
        // Map<String, List<String>> res = new HashMap<>();
        // for (String s : strs) {
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sortedS = new String(charArray);
        //     res.putIfAbsent(sortedS, new ArrayList<>());
        //     res.get(sortedS).add(s);
        // }
        // return new ArrayList<>(res.values());
        HashMap<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            if (!res.containsKey(key)) {
                res.put(key, new ArrayList<>());
            }
            //res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
