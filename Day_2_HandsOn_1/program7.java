package Day_2_HandsOn_1;

import java.util.Stack;

class QueueImplementation {

	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void push(int x) {
		s1.push(x);
	}

	public int pop() {

		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}

		return s2.pop();
	}

	public int peek() {

		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}

		return s2.peek();
	}

	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}
}

public class program7 {
	public static void main(String[] args) {

	}
}
