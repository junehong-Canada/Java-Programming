import java.util.*;

/**
 * @author Crunchify.com
 * How to iterate through Java List? Seven (7) ways to Iterate Through Loop in Java.
 * 1. Simple For loop
 * 2. Enhanced For loop
 * 3. Iterator
 * 4. ListIterator
 * 5. While loop
 * 6. Iterable.forEach() util
 * 7. Stream.forEach() util
 */

 public class IterateThroughList {
   public static void main(String args[]) {
     List<String> companyList = new ArrayList<String>();

     companyList.add("Facebook");
     companyList.add("Paypal");
     companyList.add("Google");
     companyList.add("Yahoo");

     List<String> companyListNew = Arrays.asList("Facebook", "Paypal", "Google", "Yahoo");

     System.out.println("===> 1. Simple For loop");
     for (int i = 0; i < companyList.size(); i++) {
       System.out.println(companyList.get(i));
     }

     System.out.println("===> 2. Enhanced For loop");
     for (String temp : companyList) {
       System.out.println(temp);
     }

     System.out.println("===> 3. Iterator");
     Iterator<String> iter = companyList.iterator();
     while (iter.hasNext()) {
       System.out.println(iter.next());
     }

     System.out.println("===> 4. ListIterator");
     ListIterator<String> l_iter = companyList.listIterator();
     while (l_iter.hasNext()) {
       System.out.println(l_iter.next());
     }

     System.out.println("===> 5. While loop");
     int i = 0;
     while (i < companyList.size()) {
       System.out.println(companyList.get(i));
       i++;
     }

     System.out.println("===> 6. Iterable.forEach() util");
     companyList.forEach((temp) -> {
       System.out.println(temp);
     });

     System.out.println("===> 7. Stream.forEach() util");
     companyList.stream().forEach((temp) -> System.out.println(temp));

   }

 }
