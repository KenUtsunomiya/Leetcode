class Solution {
    public int lengthOfLastWord(String s) {
        String[] splitS = s.trim().split(" ");
        return splitS[splitS.length - 1].length();
    }
}