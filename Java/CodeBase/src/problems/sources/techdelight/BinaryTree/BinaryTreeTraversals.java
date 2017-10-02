package problems.sources.techdelight.BinaryTree;

public class BinaryTreeTraversals {

	public static void main(String[] args) {

		int[] values = {10,4,2,5,6,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;

		System.out.println("Inorder");
		inorder(root);

		System.out.println("Preorder");
		preorder(root);

		System.out.println("Postorder");
		postorder(root);
	}

	public static void inorder(Node n){

		if(n == null)
			return;

		inorder(n.left);
		System.out.println(n.value);
		inorder(n.right);
	}

	public static void preorder(Node n){

		if(n == null)
			return;

		System.out.println(n.value);
		preorder(n.left);
		preorder(n.right);
	}

	public static void postorder(Node n){

		if(n == null)
			return;

		postorder(n.left);
		postorder(n.right);
		System.out.println(n.value);
	}

	public static void levelorder(Node n){
		if(n == null)
			return;


	}
}
