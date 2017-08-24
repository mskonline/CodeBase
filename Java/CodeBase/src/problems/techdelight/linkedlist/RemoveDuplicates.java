package problems.techdelight.linkedlist;

// http://www.techiedelight.com/remove-duplicates-sorted-linked-list/
public class RemoveDuplicates {

	public static void main(String[] args) {
		removeDuplicates();
	}

	public static void removeDuplicates(){
		int[] data = {1,2,2,2,5,6,7};

		LinkedList ll = new LinkedList(data);
		ll.list();

		if(ll.HEAD == null)
			return;

		Node currentNode = ll.HEAD;

		while(currentNode.next != null){
			if(currentNode.data == currentNode.next.data){
				Node nextNode = currentNode.next.next;

				currentNode.next = null;
				--ll.size;

				currentNode.next = nextNode;
			}
			else
				currentNode = currentNode.next;
		}

		ll.list();
	}
}
