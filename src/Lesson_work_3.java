import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lesson_work_3 {
    public static void main(String[] args) {
        // Task1();
        // Task2(10, 1, 10);
        // Task3();
        Task4();
    }

    static void Task1() {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1;
        String s4 = "H" + "e" + "l" + "l" + "o";
        String s5 = new String("Hello");
        String s6 = new String(new char[]{'H', 'e', 'l', 'l', 'o'});

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
        System.out.println(s6.equals(s1));

        // .equals() - сранвивает содерижмое
        // == - сравнивает ссылаясь на адрес памяти
    }

    static void Task2(int size, int min, int max) {
        /*
         * Заполнить список десятью случайными числами.
         * Отсортировать список методом sort() и вывести его на экран.
         */

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * (max - min + 1) + min));
        }
        Collections.sort(list);
        System.out.println(list);
    }

    static void Task3() {
        /*
         * Создать список ArrayList<String>. Поместить туда строки так и целые числа.
         * Пройти по списку, найти и удалить целые числа.
         */

        List<Object> list = new ArrayList<>();
        list.add("Hi");
        list.add(1);
        list.add("i");
        list.add(2);
        list.add("am");

        System.out.println(list);

        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            Object i = iterator.next();
            if (i instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    static void Task4() {
        /*
         * Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArpayList<String>> так,
         * что на 0й позиции каждого внутреннего списка содержится название жанра,
         * а на остальных позициях названия книг.
         * Напишите метод для заполнения данной структуры.
         */
        List<List<String>> bookshop = new ArrayList<>();

        AddBook("Фатнастика", "1", bookshop);
        AddBook("Роман", "2", bookshop);
        AddBook("Классика", "3", bookshop);
        AddBook("Комедия", "4", bookshop);
        AddBook("Фатнастика", "5", bookshop);

        System.out.println(bookshop);
    }

    static void AddBook(String ganre, String name, List<List<String>> shop) {
        for (int i = 0; i < shop.size(); i++) {
            if (shop.get(i).get(0).equals(ganre)) {
                shop.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(name);
        shop.add(list);
    }
}
