class Driver {
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();

		obj.insertAtEnd(3);
		obj.insertAtEnd(12);
		obj.insertAtEnd(4);
		obj.insertAtBegin(8);
		obj.insertAtBegin(15);
		obj.display();

		obj.deleteAtBegin();
		obj.deleteAtEnd();
		obj.display();
	}
}
	
