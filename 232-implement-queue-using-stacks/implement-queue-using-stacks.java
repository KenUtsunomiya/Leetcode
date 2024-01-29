import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {

    Deque<Integer> main;
        Deque<Integer> sub;

        public MyQueue() {
            main = new ArrayDeque<>();
            sub = new ArrayDeque<>();
        }

        public void push(int x) {
            while (!main.isEmpty()) {
                sub.push(main.pop());
            }

            main.push(x);

            while (!sub.isEmpty()) {
                main.push(sub.pop());
            }
        }

        public int pop() {
            return main.pop();
        }

        public int peek() {
            if (main.isEmpty()) {
                return -1;
            }
            return main.peek();
        }

        public boolean empty() {
            return main.isEmpty();
        }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */