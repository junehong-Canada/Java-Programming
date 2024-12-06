import java.util.*;

public class TripleSum {

  static int[] removeDup(int[] arr) {
    Set<Integer> set = new HashSet();
    for(int item : arr){
      set.add(item);
    }
    int len = set.size();

    int result[] = new int[len];
    int i = 0;
    for (int item : set) {
      result[i++] = item;
    }
    return result;
  }

  static int getValidIndex(int[] disA, int key) {
      int low = 0;
      int high = disA.length - 1;
      int count = -1;

      while (low <= high) {
        int mid = low + (high - low) / 2;
        if (disA[mid] <= key) {
          count = mid;
          low = mid + 1;
        } else high = mid - 1;
      }
      return count;
  }

  static long triplets(int[] a, int[] b,int[] c) {
    long ret = 0;

    int[] dA = removeDup(a);
    int[] dB = removeDup(b);
    int[] dC = removeDup(c);
    Arrays.sort(dA);
    Arrays.sort(dB);
    Arrays.sort(dC);

    for (int q : dB) {
      long c1 = getValidIndex(dA, q) + 1;
      long c3 = getValidIndex(dC, q) + 1;
      ret += c1 * c3;
    }
    return ret;
  }

  public static void main(String[] args) {
    // int[] arra = { 1, 3, 5};
    // int[] arrb = { 2, 3};
    // int[] arrc = { 1, 2, 3};
    // 8

    int[] arra = { 1, 4, 5};
    int[] arrb = { 2, 3, 3};
    int[] arrc = { 1, 2, 3};
    // 5

    // int[] arra = { 1, 3, 5, 7};
    // int[] arrb = { 5, 7, 9};
    // int[] arrc = { 7, 9, 11, 13};
    // 12

    System.out.println(triplets(arra, arrb, arrc));
  }
}
