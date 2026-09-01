package problems.leetcode.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LT705_Hashset {

    class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    private final ArrayList<Node> dataList;

    private int hash(int key) {
        return key % dataList.size();
    }

    public void add(int key) {
        int index = hash(key);
        Node node = dataList.get(index);

        if (node == null) {
            dataList.set(index, new Node(key));
        } else if (node.key == key) {
            // do nothing
        } else {
            while (node.next != null) {
                if (node.key == key) {
                    return;
                }

                node = node.next;
            }

            node.next = new Node(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        Node node = dataList.get(index);

        while (node != null) {
            if (node.key == key) {
                dataList.set(index, node.next);
                break;
            }
            node = node.next;
        }
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node node = dataList.get(index);

        while (node != null) {
            if (node.key == key) {
                return true;
            }

            node = node.next;
        }

        return false;
    }

    public LT705_Hashset() {
        dataList = new ArrayList<>(Collections.nCopies(100, null));

        add(1);
        add(1);
        add(101);
        add(2);

        System.out.println(contains(1));
        System.out.println(contains(101));
    }

    public static void main(String[] args) {
        new LT705_Hashset();
    }
}
