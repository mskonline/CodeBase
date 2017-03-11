package tutorial.collections.set;

import java.util.HashSet;
import java.util.Iterator;


/**
 * Set of objects
 * Internally implemented as Dynamic resizing array
 * Maintains Insertion order ? Yes
 * Duplicates ? No
 * Sorted ? No
 * ThreadSafe ? No
 * Add values in between ? Yes
 * Random access ? Yes
 */
public class HashSetDemo {

	public static void main(String[] args) {
		new HashSetDemo();
	}

	public HashSetDemo(){
		HashSet<Integer> hashSet = new HashSet<Integer>();

		// Adding - Adds at the end of the list
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(1));
		hashSet.add(new Integer(2));
		hashSet.add(new Integer(3));

		// Adding in between, will push items
		// hashSet.add(1, new Integer(5));

		// Iterating
		Iterator<Integer> iterator = hashSet.iterator();

		while(iterator.hasNext()){
			System.out.println(iterator.next().intValue());
		}

		// Random access
		//System.out.println(hashSet.get(3));

		// Contains (uses equals method)
		System.out.println(hashSet.contains(new Integer(1)));

		// Delete
		hashSet.remove(0);

		// Clear all
		hashSet.clear();
	}
}
