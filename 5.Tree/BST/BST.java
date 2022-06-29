
public class BST {
	class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	Node insert(Node root, int value) {
		if (null == root) {
			return new Node(value);
		}

		if (value < root.data) {
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}

		return root;
	}

	private int minValue(Node root) {
		if (null == root.left) {
			return root.data;
		}

		return minValue(root.left);
	}

	private int maxValue(Node root) {
		if (null == root.right) {
			return root.data;
		}

		return maxValue(root.right);
	}

	Node deleteNode(Node root, int target) {
		if (null == root) {
			return root;
		}

		if (target > root.data) {
			root.right = deleteNode(root.right, target);	
		} else if (target < root.data) {
			root.left = deleteNode(root.left, target);
		} else {
			// target found

			// case one - no child

			if (null == root.left && null == root.right) {
				root = null;
			} else if (null == root.left) {
				// case two - one child
				// right child remain

				root = root.right;
			} else if (null == root.right) {
				// case two - one child
				// left child remain

				root = root.left;
			} else {
				// case three - both child

				int replaceNode = minValue(root.right);
				// this can be also maxValue of right subtree
				// int replaceNode = maxValue(root.left);

				root.data = replaceNode;

				root.right = deleteNode(root.right, replaceNode);
			}

		}

		return root;
	}

	void preOrder(Node root) {
		if (null == root) {
			return;
		}

		System.out.println(root.data);

		preOrder(root.left);
		preOrder(root.right);
	}

	void inOrder(Node root) {
		if (null == root) {
			return;
		}

		inOrder(root.left);

		System.out.println(root.data);

		inOrder(root.right);
	}

	void postOrder(Node root) {
		if (null == root) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);

		System.out.println(root.data);
	}

	// This is a interview question
	void mirror(Node root) {
		if (null == root) {
			return;
		}

		// swapping the child nodes
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;

		mirror(root.left);
		mirror(root.right);
	}
}