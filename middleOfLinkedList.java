package ds;

import java.util.*;

class Node {
	Node next;
	int data;

	Node(int d) {
		next = null;
		this.data = d;
	}
}

class LinkedList {
	Node head;
	Node tail;

	LinkedList() {
		head = null;
		tail = null;
	}

	void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = tail.next;

	}

	Node middleElement() {
		if (head != null) {
			Node sptr = head;
			Node fptr = head;
			while (fptr != null && fptr.next != null) {
				sptr = sptr.next;
				fptr = fptr.next.next;
			}
			return sptr;
		}
		return null;
	}

}

class middleOfLinkedList {
	public static void main(String args[])				 {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedList l = new LinkedList();
		for (int i = 0; i < n; i++) {
			l.push(sc.nextInt());
		}
		Node mid = l.middleElement();
		if (mid != null)
			System.out.println(mid.data);
		sc.close();
	}
}