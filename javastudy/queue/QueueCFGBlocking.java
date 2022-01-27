import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueCFGBlocking {
  public static void main(String args[]) {
    Queue<Integer> pbq = new PriorityBlockingQueue<Integer>();

    pbq.add(10);
    pbq.add(20);
    pbq.add(15);

    // Printing the top element of the PriorityQueue
    System.out.println(pbq.peek());

    // Printing the top element and removing it from the PriorityQueue
    System.out.println(pbq.poll());

    System.out.println(pbq.peek());
  }
}
