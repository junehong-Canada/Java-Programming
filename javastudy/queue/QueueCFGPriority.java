import java.util.*;

public class QueueCFGPriority {
  public static void main(String args[]) {
    Queue<Integer> pq = new PriorityQueue<>();

    pq.add(10);
    pq.add(20);
    pq.add(15);

    // Printing the top element of the PriorityQueue
    System.out.println(pq.peek());

    // Printing the top element and removing it from the PriorityQueue
    System.out.println(pq.poll());

    System.out.println(pq.peek());
  }
}
