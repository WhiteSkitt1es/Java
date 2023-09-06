import java.io.FileWriter;
import java.util.Arrays;

public class Lesson_work_2 {
    public static void main(String[] args) {
        Task3(repeat("Test", 100));
    }

    public static void task1(int n, char c1, char c2) {
        /*
         * Дано четное число N (>0) и символы с1 и с2.
         * Написать метод, (который вернет строку длины N,
         * которая состоит из чередующихся символов с1 и c1, начиная с c1.
         */
        StringBuilder stringBilder = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2; i++) {
                stringBilder.append(c1).append(c2);
            }
            System.out.println(stringBilder);
        } else {
            System.out.println("N is not even number");
        }
    }

    public static void task2(String args) {
        /*
        * Напишите метод, который сжимает строку. Пример: вход aaaabbbcdd.
        Ответ: результат a4b3cd2 для примера./
        */
        char[] array = args.toCharArray();
        Arrays.sort(array);
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                stringBuilder.append(array[i - 1]).append(count + 1);
                count = 0;
            }
        }
        stringBuilder.append(array[array.length - 1]).append(count);
        System.out.println(stringBuilder);
    }

    private static String repeat(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        str = str + "\n";
        for (int i = 0; i < n; i++) {
            stringBuilder.append(i + 1).append(" ").append(str);
        }
        return stringBuilder.toString();
    }

    public static void Task3(String str) {
        /*
         * Напишите метод который составит строку, состоящую из 100 повторений слова TEST и метод,
         * который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        String path = "text.txt";
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(str);
            fileWriter.flush();
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
