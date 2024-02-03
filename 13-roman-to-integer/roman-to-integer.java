class Solution {
    Map<Character, Integer> symbolToValue = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && symbolToValue.get(s.charAt(i)) < symbolToValue.get(s.charAt(i + 1))) {
                result -= symbolToValue.get(s.charAt(i));
            } else {
                result += symbolToValue.get(s.charAt(i));
            }
        }

        return result;
    }
}