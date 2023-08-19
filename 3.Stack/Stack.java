public class Stack {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	Stack() {
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

		if (null == head.next) {
			head = null;
			return;
		}

		Node travel = head;

		while(null != travel.next.next) {
			travel = travel.next;
		}

		travel.next = null;
	}
 
	
	public void display() {
		System.out.println("Stack data");

		Node travel = head;
		while(null != travel) {
			System.out.print(travel.data + " ");
			travel = travel.next;
		}
		System.out.println("\n");
	}
}