package tutorial.collections.list;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class SortingListItems {

	private int sortType = 1;

	public static void main(String[] args) {
		new SortingListItems();
	}

	public SortingListItems(){
		LinkedList<Task> taskList = new LinkedList<Task>();

		sortType = 2;

		taskList.add(new Task("A task", 23));
		taskList.add(new Task("C task", 12));
		taskList.add(new Task("B task", 11));

		Collections.sort(taskList);

		Iterator<Task> iterator = taskList.iterator();

		while(iterator.hasNext())
			System.out.println(iterator.next().name);
	}

	public class Task implements Comparable<Task>{
		private String name;
		private long due;

		public Task(String name, long due){
			this.name = name;
			this.due = due;
		}

		@Override
		public int compareTo(Task o) {
			if(sortType == 1){
				if(this.due >=  o.due)
					return 1;
				else
					return -1;
			} else {
				char fC = this.name.charAt(0);
				char ofC = o.name.charAt(0);

				if(fC >= ofC)
					return 1;
				else
					return -1;
			}
		}
	}
}

