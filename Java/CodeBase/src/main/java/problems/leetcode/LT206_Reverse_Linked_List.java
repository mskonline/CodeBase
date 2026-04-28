package problems.leetcode;

import java.util.Stack;

public class LT206_Reverse_Linked_List {

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(final ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        return prev;
    }

    /* Recursive
    public ListNode reverseList(final ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }
     */

    /* Using a Stack
    public ListNode reverseList(final ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;

        while (node != null) {
            stack.push(node.val);
            node = node.next;
        }

        node = head;

        while (node != null) {
            node.val = stack.pop();
            node = node.next;
        }

        return head;
    }
     */

    public LT206_Reverse_Linked_List() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        ListNode newList = reverseList(head);

        // Print reversed list
        ListNode node = newList;

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        new LT206_Reverse_Linked_List();
    }
}
