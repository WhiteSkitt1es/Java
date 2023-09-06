import java.util.Arrays;
import java.util.HashSet;

public class Lesson_6_part_2 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstname = "Имя_1";
        w1.lastname = "Фамилия_1";
        w1.id = 100;
        w1.salary = 1000;

        Worker w2 = new Worker();
        w2.firstname = "Имя_2";
        w2.lastname = "Фамилия_2";
        w2.id = 200;
        w2.salary = 2000;

        Worker w3 = new Worker();
        w3.firstname = "Имя_3";
        w3.lastname = "Фамилия_3";
        w3.id = 300;
        w3.salary = 3000;

        Worker w4 = new Worker();
        w4.firstname = "Имя_1";
        w4.lastname = "Фамилия_1";
        w4.id = 100;
        w4.salary = 1000;

        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        // System.out.println(w4);

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
        System.out.println(workers);
    }
}
