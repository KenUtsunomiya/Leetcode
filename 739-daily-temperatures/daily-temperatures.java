class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.addFirst(i);
        }

        while (!stack.isEmpty()) {
            answer[stack.pop()] = 0;
        }

        return answer;
    }
}