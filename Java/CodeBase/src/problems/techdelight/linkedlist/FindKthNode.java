package problems.techdelight.linkedlist;

import problems.techdelight.linkedlist.LinkedList;

public class FindKthNode {

	public static void main(String[] args) {
		findKthNode();
	}

	public static void findKthNode(){
		int[] data = {1,2,3,4,5,6,7};
		LinkedList ll = new LinkedList(data);

		int n = 0, k = 2;

		Node currentNode = ll.HEAD;

		while(currentNode != null){
			currentNode = currentNode.next;
			++n;
		}

		currentNode = ll.HEAD;

		for (int i = 0; i < n - k; i++) {
			currentNode = currentNode.next;
		}

		System.out.println(currentNode.data);
	}
}
