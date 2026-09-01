package problems.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LT_706_Hashmap {

    static class Node {
        int key;
        int val;
        Node next;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }

        public Node() {
            next = null;
        }
    }

    private List<Node> hashmap;

    public int hash(int key) {
        return key % hashmap.size();
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node head = hashmap.get(index);

        if (head.next == null) {
            head.next = new Node(key, value);
        } else {
            Node node = head.next;

            while (true) {
                if (node.key != key) {
                    node = node.next;

                    if (node.next == null) {
                        node.next = new Node(key, value);
                        break;
                    }
                } else {
                    node.val = value;
                    return;
                }
            }
        }
    }

    public int get(int key) {
        int index = hash(key);
        Node head = hashmap.get(index);

        if (head.next == null) {
            return -1;
        } else {
            Node next = head.next;

            while (next != null) {
                if (next.key == key) {
                    return next.val;
                }
                next = next.next;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        Node head = hashmap.get(index);

        if (head.next == null) {
            return;
        } else {
            Node next = head.next;
            while (next != null) {
                if (next.key == key) {
                    head.next = next.next;
                    break;
                }
                next = next.next;
            }
        }
    }

    public LT_706_Hashmap() {
        hashmap = new ArrayList<>(Collections.nCopies(10, new Node()));

        put(1, 1);
        put(2, 2);
        System.out.println(get(1));
    }

    public static void main(String[] args) {
        new LT_706_Hashmap();
    }
}
