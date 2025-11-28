package problems.sources.techdelight.BinaryTree;

public class LCA {

	public static void main(String[] args) {
	}

	static Node lca;

	public static void findLCA(){
		int[] values = {10,4,2,5,6,4,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;


	}

	public static boolean findLCA(Node root, Node x, Node y){
		if(root == null)
			return false;

		if(root == x || root == y){
			lca = root;
			return true;
		}

		boolean left = findLCA(root, x, y);

		boolean right = findLCA(root, x, y);


		if(left && right)
			lca = root;

		return left || right;
	}
}

