import java.util.*;

public class QueueCFGLinkedList {
  public static void main(String args[]) {
    Queue<Integer> ll = new LinkedList<>();

    ll.add(10);
    ll.add(20);
    ll.add(15);

    // Printing the top element of the PriorityQueue
    System.out.println(ll.peek());

    // Printing the top element and removing it from the PriorityQueue
    System.out.println(ll.poll());

    System.out.println(ll.peek());
  }
}
