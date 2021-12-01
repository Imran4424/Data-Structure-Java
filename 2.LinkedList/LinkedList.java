public class LinkedList {
	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	Node head;

	LinkedList() {
		head = null;
	}

	public void insertAtEnd(int value) {
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

	public void deleteAtEnd() {
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
 
	public void insertAtBegin(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void deleteAtBegin() {
		if (null == head) {
			System.out.println("Underflow");
			return;
		}

		head = head.next;
	}

	public void display() {
		System.out.println("LinkedList data");

		Node travel = head;
		while(null != travel) {
			System.out.print(travel.data + " ");
			travel = travel.next;
		}
		System.out.println("\n");
	}
}