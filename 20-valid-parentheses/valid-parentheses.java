class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = Map.of(')', '(', ']', '[', '}', '{');
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                if (deque.isEmpty() || deque.peek() != map.get(c)) {
                    return false;
                }
                deque.pop();
            } else {
                deque.push(c);
            }
        }
        return deque.isEmpty();
    }
}