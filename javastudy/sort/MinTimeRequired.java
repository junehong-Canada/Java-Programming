import java.util.*;

public class MinTimeRequired {

  // static long minTime(long[] machines, long goal) {
  //   long g = 0;
  //   int days = 0;
  //   while( g < goal) {
  //     days++;
  //     for (int i = 0; i < machines.length; i++) {
  //       if (days%machines[i] == 0) g++;
  //     }
  //   }
  //   return days;
  // }
  // Return the number of items can
// be produced in temp sec.

  static long minTime(long[] machines, long goal) {
    Arrays.sort(machines); //sort the machine array
    long max = (machines[machines.length - 1]) * goal;
    long min = 0;
    long result = -1;
    //do a binary tree search
    while (max > min) {
      long midValue = (max + min) / 2;
      long unit = 0;
      for(long machine : machines){
        unit += midValue / machine;
      }

      if(unit < goal) {
        min = midValue + 1;
        result = midValue + 1;
      } else {
        max = midValue;
        result = midValue;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    long[] machines = { 2, 3, 2};
    long goal = 10;
    // 8

    // long[] machines = { 2, 3 };
    // long goal = 5;
    // 6

    // long[] machines = { 1, 3, 4 };
    // long goal = 10;
    // 7

    // long[] machines = { 4, 5, 6 };
    // long goal = 12;
    // 20

    System.out.println(minTime(machines, goal));

  }
}
