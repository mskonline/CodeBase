package tutorial.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * List of objects
 * Internally implemented as Doubly linked list
 * Maintains Insertion order ? Yes
 * Duplicates ? Yes
 * Sorted ? No
 * ThreadSafe ? No
 * Add values in between ? Yes
 * Random access ? Yes
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		new LinkedListDemo();
	}

	public LinkedListDemo(){
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		// Adding - Adds at the end of the list
		linkedList.add(new Integer(1));
		linkedList.add(new Integer(2));
		linkedList.add(new Integer(3));

		// Adding in between, will push items
		linkedList.add(1, new Integer(5));

		// Iterating
		Iterator<Integer> iterator = linkedList.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next().intValue());
		}

		// Random access
		System.out.println(linkedList.get(3));

		// Contains (uses equals method)
		System.out.println(linkedList.contains(new Integer(1)));

		// Delete
		linkedList.remove(0);

		// Clear all
		linkedList.clear();
	}
}
