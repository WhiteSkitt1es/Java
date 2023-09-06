import java.util.Arrays;

public class Lesson_work_1 {
    public static void main(String[] args) {
        System.out.println(task3("Добро пожаловать на курс по Java"));
    }

    static void task1() {
        /*Дан массив двоичных чисел, например [1,1,0,1,1,1],
        вывести максимальное количество подряд идущих 1. */
        int[] array = new int[]{1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int count = 0;
        int maxVal = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > maxVal) {
                maxVal = count;
            }
        }
        System.out.println(maxVal);
    }

    static void task2() {
        /*Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
        а остальные - равны ему. */

        int[] array = new int[]{3, 2, 2, 3};
        int val = 3;
        int[] array1 = new int[array.length];
        int count = 0;
        Arrays.fill(array1, val);
        for (int i = 0; i < array.length; i++) {
            if (val != array[i]) {
                array1[count++] = array[i];
            }
        }
        System.out.println(Arrays.toString(array1));

    }

    static String task3(String str) {
        /* Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке. */
        StringBuilder stringBuilder = new StringBuilder();
        str = str.toLowerCase();
        String[] array = str.split(" ");
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[array.length - 1 - i]).append(" ");
        }
        return stringBuilder.toString();
    }
}
