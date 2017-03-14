package tutorial.search;

public class BinarySearchTree {

	private Node HEAD;

	public static void main(String[] args) {

		BinarySearchTree binarySearchTree = new BinarySearchTree(5);
		binarySearchTree.insert(2);
	}

	public BinarySearchTree(int root) {
		HEAD = new Node(root);
		HEAD.left = null;
		HEAD.right = null;
	}

	public void insert(int data){
		this.insertNode(HEAD, data);
	}

	private void insertNode(Node n, int data){

		if(n == null){
			n = createNode(data);
			return;
		}

		if(data <= n.data)
			insertNode(n.left, data);
		else
			insertNode(n.right, data);

	}


	private Node createNode(int data){
		Node n = new Node(data);
		return n;
	}
	private Node traverseToNode(Node n, int data){


		return null;
	}

    public void delete(int data){

	}
}
