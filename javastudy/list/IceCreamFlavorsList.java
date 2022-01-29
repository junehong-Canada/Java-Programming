import java.util.*;

class Result {
    public static void whatflovors(List<Integer> cost, int money) {

      // Time limit exceeded ......
      // for (int i = 0; i < cost.size(); i++) {
      //   for (int j = i+1; j < cost.size(); j++) {
      //     if ( (cost.get(i) + cost.get(j)) == money ) {
      //       System.out.println((i+1) + " " + (j+1));
      //       break;
      //     }
      //   }
      // }

      // Time limit exceeded ......
      for (int i = 0; i < cost.size(); i++) {
        int moneysub = money - cost.get(i);
        List<Integer> costsub = cost.subList(i+1, cost.size());
        if ( costsub.contains(moneysub) ) {
          System.out.println( (i+1) + " " + (i+1+costsub.indexOf(moneysub)+1) );
          break;
        }
      }

    }
}

public class IceCreamFlavorsList {
  public static void main(String args[]) {
    List<Integer> cost = Arrays.asList(1, 4, 5, 3, 2);
    Result.whatflovors(cost, 4);
    List<Integer> cost1 = Arrays.asList(2, 2, 4, 3);
    Result.whatflovors(cost1, 4);
  }
}
