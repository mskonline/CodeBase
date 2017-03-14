package test;

import java.util.LinkedList;
import java.util.ListIterator;

public class TaskService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TaskService();
	}

	LinkedList<Task> taskList = new LinkedList<Task>();

	public TaskService(){
		addTask(new Task("T3", 1488999600003l));
		addTask(new Task("T1", 1488999600001l));
		addTask(new Task("T12", 1488999600001l));
		addTask(new Task("T2", 1488999600002l));

		removeTask("T1");
		removeTask("T3");

		addTask(new Task("T1", 1488999600001l));
		printList();
	}

	public void addTask(Task t){
		ListIterator<Task> iterator = (ListIterator<Task>) taskList.iterator();

		Task ct;
		int index = -1;

		while(iterator.hasNext()){
			ct = iterator.next();

			if(ct.due >= t.due){
				index = iterator.previousIndex();
				break;
			}
		}

		if(index != -1)
			taskList.add(index, t);
		else
			taskList.add(t);

	}

	public void removeTask(String name){

		ListIterator<Task> iterator = (ListIterator<Task>) taskList.iterator();

		Task ct;

		while(iterator.hasNext()){
			ct = iterator.next();

			if(ct.name.equalsIgnoreCase(name)){
				taskList.remove(iterator.nextIndex() - 1);
				break;
			}
		}
	}

	public void printList(){
		ListIterator<Task> iterator = (ListIterator<Task>) taskList.iterator();

		Task ct;

		while(iterator.hasNext()){
			ct = iterator.next();

			System.out.println("Task " + ct.name + " Due " + ct.due);
		}
	}
}
