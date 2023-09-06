import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Lesson_6 {
    // public static void main(String[] args) {
    //     Set <Integer> set = new HashSet<>();
    //     set.add(1);
    //     set.add(12);
    //     set.add(123);
    //     set.add(1234);
    //     set.add(1234);
    //     System.out.println(set.contains(12));
    //     set.add(null);
    //     System.out.println(set);
    //     set.remove(null);
    //     System.out.println(set.size());
    //     for (Integer item : set) {
    //         System.out.println(item);
    //     }
    //     set.clear();
    //     System.out.println(set);
    // }

     public static void main(String[] args) {
         var a = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
         var b = new LinkedHashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
         var u = new LinkedHashSet<Integer>(a);
         u.addAll(b);
         var r = new HashSet<Integer>(a);
         r.retainAll(b);
         var s = new HashSet<Integer>(a);
         s.removeAll(b);
         System.out.println(a);
         System.out.println(b);
         System.out.println(u);
         System.out.println(r);
         System.out.println(s);
     }

    // public static void main(String[] args) {
    //     Set <Integer> set = new TreeSet<>();
    //     set.add(12);
    //     set.add(1);
    //     set.add(1234);
    //     set.add(123);
    //     set.add(1234);
    //     System.out.println(set.contains(12));
    //     System.out.println(set);
    //     System.out.println(set.size());
    //     for (Integer item : set) {
    //         System.out.println(item);
    //     }
    //     set.clear();
    //     System.out.println(set);
    // }
}
