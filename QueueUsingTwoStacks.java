package ds;
import java.util.*;

class Queue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	void enQueue(int d) {
		s1.push(d);
	}

	void deQueue() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());
		}
		s2.pop();
	}

	int printfront() {
		if (s2.isEmpty()) {
			while (!s1.isEmpty())
				s2.push(s1.pop());

		}
		return s2.peek();
	}
}

class QueueUsingTwoStacks {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int queries = sc.nextInt();
		Queue q = new Queue();
		while (queries-- > 0) {
			int input = sc.nextInt();
			if (input == 1)
				q.enQueue(sc.nextInt());
			if (input == 2)
				q.deQueue();
			if (input == 3)
				System.out.println(q.printfront());

		}
sc.close();
	}
}