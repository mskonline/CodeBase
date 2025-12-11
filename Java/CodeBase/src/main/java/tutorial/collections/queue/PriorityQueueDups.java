package tutorial.collections.queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDups {
    public static void main(String[] args) {
        // Custom comparator to maintain order for duplicates
        Comparator<Integer> customComparator = (a, b) -> {
            int result = Integer.compare(a % 10, b % 10);
            return result == 0 ? Integer.compare(a, b) : result;
        };

        // PriorityQueue with custom comparator
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        // Adding elements to PriorityQueue
        priorityQueue.add(15);
        priorityQueue.add(22);
        priorityQueue.add(22);
        priorityQueue.add(22);
        priorityQueue.add(11);
        priorityQueue.add(30);


        int k = 4;
        int i = 0;
        int largest = priorityQueue.peek();

        // Polling elements from PriorityQueue
        /*while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }*/

        Iterator iterator = priorityQueue.iterator();

        while(iterator.hasNext()){
            ++i;
            largest = (Integer) iterator.next();

            if (i == k) {
                break;
            }
        }

        System.out.println(largest);
    }
}


