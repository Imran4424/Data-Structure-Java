class Driver {
	public static void main(String[] args) {
		Stack obj = new Stack();

		obj.push(3);
		obj.push(12);
		obj.push(4);
		obj.display();

		obj.pop();
		obj.display();

		obj.push(8);
		obj.push(15);
		obj.display();

		obj.pop();
		obj.display();
	}
}
	
