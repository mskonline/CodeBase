package problems.sources.techdelight.BinaryTree;

public class MirrorofBinaryTree {

	public static void main(String[] args) {
		int[] values = {10,4,2,5,6,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;

		bst.printTree();
		mirrorofBinaryTree(root);
		bst.printTree();
	}

	public static void mirrorofBinaryTree(Node n){
		if(n == null)
			return;

		mirrorofBinaryTree(n.left);
		mirrorofBinaryTree(n.right);

		swap(n);
	}

	public static void swap(Node n){
		Node temp = n.left;
		n.left = n.right;
		n.right = temp;
	}
}
