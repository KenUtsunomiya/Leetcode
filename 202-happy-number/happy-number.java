class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n > 1) {
            n = calcSumOfDigitsSquares(n);
            if (seen.contains(n)) {
                return false;
            }
            seen.add(n);
        }
        return true;
    }

    private int calcSumOfDigitsSquares(int n) {
        int result = 0;
        while (n > 0) {
            int d = n % 10;
            result += (int) Math.pow(d, 2);
            n /= 10;
        }
        return result;
    }
}