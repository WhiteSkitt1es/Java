import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Lesson_work_5 {
    public static void main(String[] args) {
        //Task1();
        //System.out.println(Task2("title", "paper"));
        //System.out.println(Task3("f{n - 1} + f(n - 2)"));
        System.out.println(Task4("Мороз и солнце; день чудесный! Еще ты дремлешь, друг прелестный - Пора, красавица, проснись."));
    }

    static void Task1() {
        /*
         * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации
         * 123456 Иванов
         * 321456 Васильев
         * 234561 Петрова
         * 234432 Иванов
         * 654321 Петрова
         * 345678 Иванов
         Вывести данные по сотрудникам с фамилией Иванов
         */
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");
        System.out.println(passports.getByLastname("Иванов"));
        System.out.println(passports.getbypassnum("234432"));
        System.out.println(passports.getAll());

    }

    static boolean Task2(String str1, String str2) {
        /*
         * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
         * Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
         * 1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
         * (Например, add - egg изоморфны)
         * 2. буква может не меняться, а остаться такой же. (Например, note - code)
         * Пример 1:
         * Input: s = "foo", t = "bar"
         * Output: false
         * Пример 2:
         * Input: s = "paper", t = "title"
         * Output: true
         */

        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i]) && map.containsValue(c2[i])) {
                return true;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return false;
    }

    static boolean Task3(String str) {
        /*
         * Написать программу, определяющую правильность расстановки скобок в выражении
         * Пример 1: а+(d*3) - истина
         * Пример 2: [а+(1*3) - ложь
         * Пример 3: [6+(3*3)] - истина
         * Пример 4: {a)[+]{(d*3)] - истина
         * Пример 5: <{a]+{(d*3)]> - истина
         * Пример 6: {a+]](d*3)] - ложь
         */
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) stack.push(ch[i]);
            if (map.containsValue(ch[i])) {
                if (stack.isEmpty() || map.get(stack.pop()) != ch[i]) {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }

    static Map<Integer, List<String>> Task4(String str) {
        /*
         * Взять набор строк, например,
         * Мороз и солнце; день чудесный!
         * Еще ты дремлешь, друг прелестный -
         * Пора, красавица, проснись.
         * Написать метод, который отсортирует эти строки по длине с помощью ТrееМар.
         * Строки с одинаковой длиной не должны "потеряться*
         */
        str = str.replace(".", "");
        str = str.replace(",", "");
        str = str.replace(";", "");
        str = str.replace("- ", "");
        str = str.replace("!", "");
        String[] words = str.split(" ");
        Map<Integer, List<String>> map = new TreeMap<>();
        for (String word : words) {
            int len = word.length();
            if (map.containsKey(len)) {
                List<String> list = map.get(len);
                list.add(word);
            } else {
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(len, list);
            }
        }
        return map;
    }
}