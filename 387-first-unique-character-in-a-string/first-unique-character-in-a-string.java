class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charToCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : s.toCharArray()) {
            if (charToCount.get(c) == 1) {
                return s.indexOf(c);
            }
        }
        
        return -1;
    }
}