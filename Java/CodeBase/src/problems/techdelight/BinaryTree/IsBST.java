package problems.techdelight.BinaryTree;

public class IsBST {

	public static void main(String[] args) {
		int[] values = {10,4,2,5,6,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;

		System.out.println(isBST(root));
	}

	public static boolean isBST(Node n){
		if(isBST(n, Integer.MIN_VALUE, Integer.MAX_VALUE))
			return true;
		else
			return false;
	}

	public static boolean isBST(Node n, int min, int max){
		if(n == null)
			return true;

		if(n.value < min || n.value > max)
			return false;

		return isBST(n.left, min, n.value) && isBST(n.right, n.value, Integer.MAX_VALUE);
	}
}
