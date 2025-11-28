package tutorial.collections.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * List of objects
 * Internally implemented as Dynamic resizing array
 * Maintains Insertion order ? Yes
 * Duplicates ? Yes
 * Sorted ? No
 * ThreadSafe ? No
 * Add values in between ? Yes
 * Random access ? Yes
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		new ArrayListDemo();
	}

	public ArrayListDemo(){
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		// Adding - Adds at the end of the list
		arrayList.add(new Integer(1));
		arrayList.add(new Integer(2));
		arrayList.add(new Integer(3));

		// Adding in between, will push items
		arrayList.add(1, new Integer(5));

		// Iterating
		Iterator<Integer> iterator = arrayList.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next().intValue());
		}

		// Random access
		System.out.println(arrayList.get(3));

		// Contains (uses equals method)
		System.out.println(arrayList.contains(new Integer(1)));

		// Delete
		arrayList.remove(0);

		// Clear all
		arrayList.clear();
	}
}
