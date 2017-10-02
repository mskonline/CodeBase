package problems.sources.techdelight.BinaryTree;

public class HeightofBinaryTree {

	public static void main(String[] args) {
		heightofBinaryTree();
	}

	public static void heightofBinaryTree(){
		int[] values = {10,4,2,5,6,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;

		System.out.println(heightofBinaryTree(root));
	}

	public static int heightofBinaryTree(Node n){
		if(n == null)
			return 0;

		int lheight = heightofBinaryTree(n.left);
		int rheight = heightofBinaryTree(n.right);

		return Math.max(lheight, rheight) + 1;
	}
}
