package problems.sources.techdelight.linkedlist;

public class IntersectionOfLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB == null) return null;

        Node listA = headA;
        Node listB = headB;

	    while(listA != listB){
	    	listA = listA == null? headB : listA.next;
	    	listB = listB == null? headA : listB.next;
	    }

	    return listA;
    }
}
