package problems.techdelight.BinaryTree;

public class BinarySearchTree {

	public Node root = null;
	public int numNodes = 0;

	public static void main(String[] args) {
	}

	public BinarySearchTree(int[] values) {
		insert(values);
	}

	public void insert(int[] values) {
		if (values == null || values.length == 0)
			return;

		int key;

		for (int i = 0; i < values.length; i++) {

			Node newNode = new Node(values[i]);
			key = values[i];

			if (root == null) {
				root = newNode;
			} else {
				Node focusNode = root;
				Node parent;

				while (true) {
					parent = focusNode;

					if (key <= focusNode.value) {

						focusNode = focusNode.left;

						if (focusNode == null) {
							parent.left = newNode;
							++numNodes;
							break;
						}
					} else {
						focusNode = focusNode.right;

						if (focusNode == null) {
							parent.right = newNode;
							++numNodes;
							break;
						}
					}
				}
			}
		}
	}

	public void insert(int v) {
		Node newNode = new Node(v);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (v < focusNode.value) {

					focusNode = focusNode.left;

					if (focusNode == null) {
						parent.left = newNode;
						++numNodes;
						break;
					}
				} else {
					focusNode = focusNode.right;

					if (focusNode == null) {
						parent.right = newNode;
						++numNodes;
						break;
					}
				}
			}
		}
	}

	public void printTree(){
		inorder(root);
	}

	public void inorder(Node n){
		if(n == null)
			return;

		inorder(n.left);
		System.out.println(n.value);
		inorder(n.right);
	}
}
