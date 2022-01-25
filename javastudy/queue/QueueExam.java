// https://www.geeksforgeeks.org/queue-interface-java/

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
  public static void main(String[] args){
    Queue<Integer> q = new LinkedList<>();

    for (int i = 0; i < 5; i++)
      q.add(i);

    System.out.println("Elements of queue " + q);

    int removedEle = q.remove();
    System.out.println("removed Element-" + removedEle);
    System.out.println("Elements of queue " + q);

    int head = q.peek();
    System.out.println("head of queue-" + head);
    int size = q.size();
    System.out.println("size of queue-" + size);
  }
}
