import java.util.*;

public class QueueCFGIterating {
  public static void main(String args[]) {
    Queue<String> pq = new PriorityQueue<>();

    pq.add("Geeks");
    pq.add("For");
    pq.add("Geeks");

    Iterator iter = pq.iterator();
    while (iter.hasNext()) {
        System.out.print(iter.next() + " ");
    }
  }
}
