package problems.ctci.linkedlist;

// http://www.techiedelight.com/detect-cycle-linked-list-floyds-cycle-detection-algorithm/
public class DetectCycles {

	public static void main(String[] args) {
		detectCycles();
	}

	public static void detectCycles(){
		boolean cycleDetected = false;

		int[] data = {1,2,3,4,5,6,7};
		LinkedList ll = new LinkedList(data);

		Node HEAD = ll.HEAD;

		Node slow = HEAD, fast = HEAD;

		while(fast != null && fast.next != null){
			slow = slow.next;

			fast = fast.next.next;

			if(slow == fast){
				cycleDetected = true;
				break;
			}
		}

		if(cycleDetected)
			System.out.println("Cycle detected");
		else
			System.out.println("No Cycle detected");
	}
}
