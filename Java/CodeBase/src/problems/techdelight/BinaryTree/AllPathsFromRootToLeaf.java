package problems.techdelight.BinaryTree;

import java.util.Stack;

public class AllPathsFromRootToLeaf {

	public static void main(String[] args) {
		int[] values = {10,4,2,5,6,1};

		BinarySearchTree bst = new BinarySearchTree(values);
		Node root = bst.root;

		allPathsFromRootToLeaf(root);
	}

	public static void allPathsFromRootToLeaf(Node n){
		allPathsFromRootToLeaf(n, new Stack<Integer>());
	}

	public static void allPathsFromRootToLeaf(Node n, Stack<Integer> path){
		if(n == null)
			return;

		path.push(n.value);

		if(n.left == null && n.right == null){
			for(int i : path)
				System.out.print(i + " ");

			System.out.println();
		}

		allPathsFromRootToLeaf(n.left, path);
		allPathsFromRootToLeaf(n.right, path);

		path.pop();
	}
}
