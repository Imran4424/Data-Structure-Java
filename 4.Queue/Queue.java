public class Queue {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	Queue() {
		head = null;
	}

	public void push(int value) {
		Node newNode = new Node(value);

		if (null == head) {
			head = newNode;
			return;
		}

		Node travel = head;
		while(null != travel.next) {
			travel = travel.next;
		}

		travel.next = newNode;
	}

	public void pop() {
		if (null == head) {
			System.out.println("Underflow");
			return;
		}

		head = head.next;
	}

	public void display() {
		System.out.println("Queue data");

		Node travel = head;
		while(null != travel) {
			System.out.print(travel.data + " ");
			travel = travel.next;
		}

		System.out.println("\n");
	}
}