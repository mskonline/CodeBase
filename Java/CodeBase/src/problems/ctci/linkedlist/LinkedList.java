package problems.ctci.linkedlist;

public class LinkedList {
	Node HEAD;
	int size = 0;

	public LinkedList(int data){
		insert(data);
	}

	public LinkedList(int[] data){
		insert(data);
	}

	public void insert(int data){
		if(HEAD == null){
			HEAD = new Node(data);
			return;
		}

		Node nextNode = HEAD.next;
		Node parent = HEAD;

		while(nextNode != null){
			parent = nextNode;
			nextNode = nextNode.next;
		}

		parent.next = new Node(data);
		++size;
	}

	public void insert(int[] data){
		for (int i : data) {
			if(HEAD == null){
				HEAD = new Node(i);
				++size;
				continue;
			}

			Node nextNode = HEAD.next;
			Node parent = HEAD;

			while(nextNode != null){
				parent = nextNode;
				nextNode = nextNode.next;
			}

			parent.next = new Node(i);
			++size;
		}
	}

	public void list(){
		if(HEAD == null)
			return;

		Node current = HEAD;

		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}

		System.out.println("Size : " + size);
	}

	public static void main(String[] args) {

		int[] data = {1,2,3,4,5,6,7};

		LinkedList ll = new LinkedList(data);
		ll.list();
	}
}
