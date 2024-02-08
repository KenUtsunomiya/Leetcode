class Solution {
    public int lengthOfLastWord(String s) {
        int lengthOfLastWord = 0;
        int idx = 0;
        while (idx < s.length()) {
            int length = 0;
            while (idx < s.length() && s.charAt(idx) != ' ') {
                length++;
                idx++;
            }
            if (length > 0) {
                lengthOfLastWord = length;
            }
            idx++;
        }
        return lengthOfLastWord;
    }
}