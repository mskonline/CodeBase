package problems.techdelight.linkedlist;

public class ReverseList {

	public static void main(String[] args) {
		reverseList();
	}

	public static void reverseList(){
		int[] data = {1,2,3,4,5,6,7};

		LinkedList ll = new LinkedList(data);
		ll.list();

		Node HEAD = ll.HEAD;

		if(HEAD == null)
			return;

		Node currentNode = HEAD;
		Node nextNode = currentNode.next;
		currentNode.next = null;

		while(nextNode != null){
			Node temp = nextNode.next;

			nextNode.next = currentNode;

			currentNode = nextNode;
			nextNode = temp;
		}

		ll.HEAD = currentNode;

		ll.list();
	}
}
