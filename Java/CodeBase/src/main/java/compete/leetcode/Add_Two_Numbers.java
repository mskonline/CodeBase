package compete.leetcode;

public class Add_Two_Numbers {

	public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		new Add_Two_Numbers();
	}

	public Add_Two_Numbers(){
		ListNode l1 = new ListNode(1);
		ListNode l12 = new ListNode(8);
		l1.next = l12;
		//ListNode l13 = new ListNode(9);
		//l12.next = l13;

		ListNode l2 = new ListNode(0);
		//ListNode l22 = new ListNode(9);
		//l2.next = l22;
		//ListNode l23 = new ListNode(9);
		//l22.next = l23;

		traverseList(addTwoNumbers(l1, l2));
	}

	public void traverseList(ListNode l){
		while(l != null){
			System.out.println(l.val);
			l = l.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = addTwoNumbers(l1, l2, 0);
		return result;
    }

	public ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
		if(l1 != null || l2 != null){
			int val1 = l1 != null ? l1.val : 0;
			int val2 = l2 != null ? l2.val : 0;
			int fcarry = 0;
			ListNode l;

			if(val1 + val2 + carry < 10){
				l = new ListNode(val1 + val2 + carry);
			} else {
				l = new ListNode((val1 + val2 + carry) % 10);
				fcarry = 1;
			}

			l1 = l1!= null ? l1.next : null;
			l2 = l2!= null ? l2.next : null;

			l.next = addTwoNumbers(l1, l2, fcarry);
			return l;
		} else if(carry == 1){
			return new ListNode(1);
		}
		return null;
	}
}
