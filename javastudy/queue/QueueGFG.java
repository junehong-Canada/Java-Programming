import java.util.*;

public class QueueGFG {
  public static void main(String args[]){
    Queue<String> pq = new PriorityQueue<>();

    pq.add("Geeks");
    pq.add("For");
    pq.add("Geeks");
    System.out.println("Initial Queue " + pq);

    Iterator iter = pq.iterator();
    while (iter.hasNext()) {
        System.out.print(iter.next() + " ");
    }
    System.out.println(" ");

    pq.remove("Geeks");
    System.out.println("After Remove " + pq);
    System.out.println("Poll Method " + pq.poll());
    System.out.println("Final Queue " + pq);
  }
}

/**
remove(): remove an element from a queue.
poll(): remove the head and return it.
peek(): return the head (don't remove)
*/

/**
 https://www.geeksforgeeks.org/queue-interface-java/
 1. PriorityQueue
 2. LinkedList
 3. PriorityBlockingQueue
*/
