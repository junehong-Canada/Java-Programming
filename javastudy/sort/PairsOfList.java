import java.util.*;

public class PairsOfList {

  static int pairs(int k, List<Integer> arr) {
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    for(int num : arr) {
        set.add(num);
    }

    for(int number : arr) {
        if(set.contains(number + k)) {
            count++;
        }
    }
    return count;

    // Timeout
    // int result = 0;
    // Collections.sort(arr, Collections.reverseOrder());
    // for (int i = 0; i < arr.size(); i++) {
    //   for (int j = 1; j < arr.size(); j++) {
    //     if ((arr.get(i) - arr.get(j)) == k)
    //         result++;
    //   }
    // }
    // return result;
  }

  public static void main(String args[]) {
    // int k = 1;
    // List<Integer> arr = Arrays.asList(1, 2, 3, 4);
    int k = 2;
    List<Integer> arr = Arrays.asList(1, 5, 3, 4, 2);

    int result = pairs(k, arr);
    System.out.println(result);
  }
}
