import java.util.*;
import java.util.stream.*;
import java.io.*;

class Result {

    /*
     * Complete the 'swapNodes' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY indexes
     *  2. INTEGER_ARRAY queries
     */

    public static List<List<Integer>> swapNodes(List<List<Integer>> indexes, List<Integer> queries) {
      // Write your code here
      System.out.println(indexes);
      System.out.println(queries);
      List<List<Integer>> swapped = new ArrayList<>();
      return swapped;
    }
}

public class TreeList2D {
  public static void main(String[] args) {
    // public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // int n = Integer.parseInt(bufferedReader.readLine().trim());

        // List<List<Integer>> indexes = new ArrayList<>();
        //
        // IntStream.range(0, n).forEach(i -> {
        //     try {
        //         indexes.add(
        //             Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        //                 .map(Integer::parseInt)
        //                 .collect(Collectors.toList())
        //         );
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // });
        //
        // int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());
        //
        // List<Integer> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
        //     try {
        //         return bufferedReader.readLine().replaceAll("\\s+$", "");
        //     } catch (IOException ex) {
        //         throw new RuntimeException(ex);
        //     }
        // })
        //     .map(String::trim)
        //     .map(Integer::parseInt)
        //     .collect(Collectors.toList());

        List<List<Integer>> indexes = new ArrayList<>();
        indexes.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
        indexes.add(new ArrayList<Integer>(Arrays.asList(-1, -1)));
        indexes.add(new ArrayList<Integer>(Arrays.asList(-1, -1)));

        List<Integer> queries = new ArrayList<Integer>(Arrays.asList(1, 1));

        List<List<Integer>> result = Result.swapNodes(indexes, queries);
        
        System.out.println(result);

        // result.stream()
        //     .map(
        //         r -> r.stream()
        //             .map(Object::toString)
        //             .collect(joining(" "))
        //     )
        //     .map(r -> r + "\n")
        //     .collect(toList())
        //     .forEach(e -> {
        //         try {
        //             bufferedWriter.write(e);
        //         } catch (IOException ex) {
        //             throw new RuntimeException(ex);
        //         }
        //     });

        // bufferedReader.close();
        // bufferedWriter.close();
    }
}
