package tutorial.collections.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue1 = new PriorityQueue<>();
		queue1.offer(10);
		queue1.offer(9);
		queue1.offer(8);
		queue1.offer(7);
		queue1.offer(6);

		while(queue1.size() > 0)
			System.out.println(queue1.remove());
	}

}
