package binarytrees;

// Build a BST
// Create nodes
// Insert a node
// Find a node
// Traversal

public class TreeExample {
	class Node {
		private int val;
		private Node left;
		private Node right;

		Node(int val) {
			this.val = val;
			left = right = null;
		}

		@Override
		public String toString() {
			return "Node=" + this.val;
		}
	}

	private Node root;

	public void insert(int val) {
		Node node = new Node(val);
		if (root == null) {
			root = node;
			return;
		}

		Node current = root;
		while (true) {
			if (current.val > val) {
				if (current.left == null) {
					current.left = node;
					break;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = node;
					break;
				}
				current = current.right;
			}
		}

	}

	public boolean find(int val) {
		Node current = root;
		while (current != null) {
			if (val < current.val)
				current = current.left;
			else if (val > current.val)
				current = current.right;
			else
				return true;
		}
		return false;
	}

	// In order Traversal

	public void inorder(Node root) {
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	// PreOrder

	public void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	// PostOrder

	public void postOrder(Node root) {
		if (root == null)
			return;

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val + " ");
	}

	// Level Order Traversal
	public int height(Node root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	public void printLevelOrder() {
		int h = height(root);
		for (int i = 0; i <= h; i++)
			printCurrentLevel(root, i);
	}

	public void printCurrentLevel(Node root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.val + " ");
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	// Removal of node from the tree
	public void remove(Node root, int val) {
		Node root1 = root;
		if (root1 == null)
			throw new IllegalStateException();
		Node current = root1;
		Node prev = root1;
		while (true) {
			if (val < current.val) {
				prev = current;
				current = current.left;
			} else if (val > current.val) {
				prev = current;
				current = current.right;
			} else {
				if (current.left == null && current.right == null) {
					if (prev.right == current)
						prev.right = null;
					else
						prev.left = null;
					return;
				} else if (current.left != null && current.right == null) {
					prev.left = current.left;
					return;
				} else if (current.right != null && current.left == null) {
					prev.right = current.right;
					return;
				} else {
					Node currentLeft = current.left;
					if (prev.left == current)
						prev.left = current.right;
					else
						prev.right = current.right;
					Node current1 = current.right;
					while (current1.left != null) {
						current1 = current1.left;
					}
					current1.left = currentLeft;
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		TreeExample tree = new TreeExample();
		tree.insert(8);
		tree.insert(5);
		tree.insert(12);
		tree.insert(2);
		tree.insert(7);
		tree.insert(10);
		tree.insert(13);
		tree.insert(1);
		tree.insert(3);
		tree.insert(6);
		tree.insert(4);

		System.out.println(tree.find(7));
		System.out.println(tree.find(1));
		System.out.println("In Order Traversal: ");
		tree.inorder(tree.root);
		System.out.println("\nPre Order Traversal: ");
		tree.preOrder(tree.root);
		System.out.println("\nPost Order Traversal: ");
		tree.postOrder(tree.root);
		System.out.println("\nLevel Order/ Breadth First Order Traversal: ");
		tree.printLevelOrder();

		tree.remove(tree.root, 12);
		System.out.println();
		tree.printLevelOrder();
	}

}
