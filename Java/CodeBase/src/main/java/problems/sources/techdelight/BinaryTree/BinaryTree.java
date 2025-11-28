package problems.sources.techdelight.BinaryTree;

import java.util.Random;

public class BinaryTree {

	public Node root;

	public static void main(String[] args) {
	}

	public BinaryTree(int[] values){
		if(values == null || values.length == 0)
			return;

		insert(values);
	}

	public void insert(int v){
		if(root == null){
			root = new Node(v);
			return;
		}

		Random r = new Random();

		Node n;

		if(r.nextInt(100) % 2 == 0){
			n = root.right;

			while(n != null){
				if(r.nextInt(100) % 2 == 0)
					n = n.right;
				else
					n = n.left;
			}
		}else {
			// left
		}
	}

	public void insert(int[] v){
		if(root == null){
			root = new Node(v[0]);
		}

		for (int i = 1; i < v.length; i++) {

		}
	}
}
