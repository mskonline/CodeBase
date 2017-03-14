package tutorial.search;

public class Node {

	public int data;
	public Node left;
	public Node right;

	public Node(int data){
		this.data = data;
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
}
