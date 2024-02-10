class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charToCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charToCount.put(c, charToCount.getOrDefault(c, 0) + 1);
        }
        
        for (char c : t.toCharArray()) {
            if (!charToCount.containsKey(c)) {
                return false;
            }
            charToCount.put(c, charToCount.get(c) - 1);
            if (charToCount.get(c) == 0) {
                charToCount.remove(c);
            }
        }
        
        return charToCount.isEmpty();
    }
}