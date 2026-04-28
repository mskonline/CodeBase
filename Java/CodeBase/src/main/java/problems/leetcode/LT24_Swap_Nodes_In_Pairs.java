package problems.leetcode;

public class LT24_Swap_Nodes_In_Pairs {

    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            swapNodeValues(curr, curr.next);

            if (curr.next != null)
                curr = curr.next.next;
            else
                curr = null;
        }

        return head;
    }

    public void swapNodeValues(ListNode n1, ListNode n2) {
        if (n2 != null) {
            int temp = n2.val;
            n2.val = n1.val;
            n1.val = temp;
        }
    }

    public LT24_Swap_Nodes_In_Pairs(){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode newList = swapPairs(head);

        // Print reversed list
        ListNode node = newList;

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        new LT24_Swap_Nodes_In_Pairs();
    }
}
