import java.util.*;

class ArrayList2D {
  static List create2DArrayList() {
    ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();

    x.add(new ArrayList<Integer>());
    x.get(0).add(0, 3);

    x.add(new ArrayList<Integer>(Arrays.asList(3, 4, 6)));
    x.get(1).add(0, 366);
    x.get(1).add(4, 576);

    x.add(2, new ArrayList<>(Arrays.asList(3, 84)));

    x.add(new ArrayList<Integer>(Arrays.asList(83, 6684, 776)));

    x.add(new ArrayList<>(Arrays.asList(8)));

    x.get(4).addAll(Arrays.asList(9, 10, 11));

    x.get(1).addAll(3, Arrays.asList(22, 1000));

    return x;
  }

  public static void main(String args[]) {
    System.out.println(create2DArrayList());
  }
}
