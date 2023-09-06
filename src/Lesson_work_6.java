import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson_work_6 {
    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
    }

    static void Task1() {
        /*
         * 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         * Распечатайте содержимое данного множества
         * 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         * Распечатайте содержимое данного множества.
         * 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
         * Распечатайте содержимое данного множества
         */
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set1);

        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set2);
    }

    static void Task2() {
        /*
         * 1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
         * 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set
         * вычислите процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
         * Для вычисления процента используйте формулу:
         * процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве
         */
        System.out.println(unique(genArray(0, 24, 1000)));

    }

    static Integer[] genArray(int max, int min, int size) {
        Integer[] array = new Integer[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    static double unique(Integer[] array) {
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        double percent = set.size() * 100.0 / array.length;
        return percent;
    }

    static void Task3() {
        /*
         * 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
         * можно использовать не все придуманные поля и методы.
         * Создайте несколько экземпляров этого класса, выведите их в консоль.
         * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
         * выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
         */
        Cat cat = new Cat("Барсик", "Павел Александрович", "Дворовый", 5);
        System.out.println(cat);
    }

    static void Task4() {
        /*
         * 1. Создайте множество, в котором будут храниться экземпляры класса Cat HashSet<Cat>. Поместите в него некоторое количество объектов
         * 2. Создайте 2 или более котов с одинаковыми параметрами в полях.
         * Поместите их во множество. Убедитесь что все они сохранились во множество
         * 3. Создайте метод
         * **public boolean**
         * equals(Obiect o)
         * Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
         * 4. Создайте метод
         * **public int hashCode(**
         * который будет возвращать hash, вычисленный на основе полей класса
         * Cat. (Можно использовать
         * Objects.hash(...))
         * 5. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились
         */

        Cat cat1 = new Cat("Барсик", "Павел Александрович", "Дворовый", 5);
        Cat cat2 = new Cat("Мурзик", "Артем Александрович", "Сибирский", 7);
        Cat cat3 = new Cat("Рыжик", "Василий Петрович", "Мейнкун", 4);
        Cat cat4 = new Cat("Барсик", "Павел Александрович", "Дворовый", 5);

        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        set.add(cat4);
        System.out.println(set);
        System.out.println(cat1.equals(cat4));
        System.out.println(cat1 == cat4);
    }

}
