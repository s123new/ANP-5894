package Collection;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue Operations
Design a program that demonstrates the use of a Queue:
a) Enqueue elements into the queue.
b) Dequeue elements from the queue.
c) Check whether the queue is empty.
d) Print the elements in the queue.
 */


public class QueueOperation {
    public static void main(String[] args) {
        // Create a queue using LinkedList
        Queue<String> queue = new LinkedList<>();
        
        // Enqueue elements into the queue
        queue.add("Rebel");
        queue.add("Bachan");
        queue.add("Shivsir");
        queue.add("Sandy");
        
        // Print the elements in the queue
        System.out.println("Elements in the queue: " + queue);
        
        // Dequeue elements from the queue
        String removedElement = queue.poll();
        System.out.println("Dequeued element: " + removedElement);
        
        // Check if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
        
        // Print the remaining elements in the queue
        System.out.println("Remaining elements in the queue: " + queue);
    }
}