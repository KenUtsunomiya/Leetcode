class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = calcSumOfDigitsSquares(slow);
            fast = calcSumOfDigitsSquares(calcSumOfDigitsSquares(fast));
        } while (slow != fast);

        return slow == 1;
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