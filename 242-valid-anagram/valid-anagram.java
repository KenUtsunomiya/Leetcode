class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charToCountS = new HashMap<>();
        Map<Character, Integer> charToCountT = new HashMap<>();
        int idx = 0;
        while (idx < s.length()) {
            charToCountS.put(s.charAt(idx), charToCountS.getOrDefault(s.charAt(idx), 0) + 1);
            charToCountT.put(t.charAt(idx), charToCountT.getOrDefault(t.charAt(idx), 0) + 1);
            idx++;
        }

        for (char key : charToCountS.keySet().stream().toList()) {
            if (!charToCountS.get(key).equals(charToCountT.getOrDefault(key, 0))) {
                return false;
            }
        }
        
        return true;
    }
}