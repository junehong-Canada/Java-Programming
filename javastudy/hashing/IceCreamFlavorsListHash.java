import java.util.*;

class Result {
    public static void whatflovors(List<Integer> cost, int money) {
      HashMap<Integer, Integer> hashMap = new HashMap<>();
      for (int i = 0; i < cost.size(); i++) {
        if (cost.get(i) < money) {
          if (hashMap.containsKey(money - cost.get(i))) {
            int index = hashMap.get(money - cost.get(i));
            System.out.println((index+1) + " " + (i+1));
            return;
          }

          // if (!hashMap.containsKey(cost.get(i))) // ???
            hashMap.put(cost.get(i), i);
        }
        System.out.println("Map  : " + hashMap);
      }
    }
}

public class IceCreamFlavorsListHash {
  public static void main(String args[]) {
    List<Integer> cost = Arrays.asList(1, 4, 5, 3, 2);
    Result.whatflovors(cost, 4);
    List<Integer> cost1 = Arrays.asList(2, 2, 4, 3);
    Result.whatflovors(cost1, 4);
  }
}
