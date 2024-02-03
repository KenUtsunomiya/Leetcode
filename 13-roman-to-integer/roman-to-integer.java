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
        int idx = 0;
        while (idx < s.length()) {
            switch (s.charAt(idx)) {
                case 'I':
                    if (idx + 1 < s.length() && (s.charAt(idx + 1) == 'V' || s.charAt(idx + 1) == 'X')) {
                        result += symbolToValue.get(s.charAt(idx + 1)) - symbolToValue.get(s.charAt(idx));
                        idx += 2;
                    } else {
                        result += symbolToValue.get(s.charAt(idx));
                        idx++;
                    }
                    break;
                case 'X':
                    if (idx + 1 < s.length() && (s.charAt(idx + 1) == 'L' || s.charAt(idx + 1) == 'C')) {
                        result += symbolToValue.get(s.charAt(idx + 1)) - symbolToValue.get(s.charAt(idx));
                        idx += 2;
                    } else {
                        result += symbolToValue.get(s.charAt(idx));
                        idx++;
                    }
                    break;
                case 'C':
                    if (idx + 1 < s.length() && (s.charAt(idx + 1) == 'D' || s.charAt(idx + 1) == 'M')) {
                        result += symbolToValue.get(s.charAt(idx + 1)) - symbolToValue.get(s.charAt(idx));
                        idx += 2;
                    } else {
                        result += symbolToValue.get(s.charAt(idx));
                        idx++;
                    }
                    break;
                default:
                    result += symbolToValue.get(s.charAt(idx));
                    idx++;
                    break;
            }
        }
        
        return result;
    }
}