import java.util.*;

public class Lesson_work_4 {
    public static void main(String[] args) {
        //Task1();
        //Task2();
        //Task3();
        //Task4();
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.empty());

    }

    static void Task1() {
        /*
         * 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
         * 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните c предидущим.
         */

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(0, i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void Task2() {
        /*
         * Реализовать консольное приложение, которое:
         * Принимает от пользователя строку вида
         * text ~ num
         * 1. Нужно рассплитить строку по ~, сокранить tехт в связный список на позицию num.
         * 2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
         */
        LinkedList<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            while (work) {
                System.out.println("Введите значение text~num: ");
                String line = scanner.nextLine();
                String[] arr = line.split("~");
                int num = Integer.parseInt(arr[1]);
                String text = arr[0];
                switch (text) {
                    case "print":
                        System.out.println(list.remove(num));
                        break;
                    case "exit":
                        System.out.println("Завершение программы");
                        work = false;
                    default:
                        list.add(num, text);
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static void Task3() {
        /*
         * Реализовать консольное приложение, которое:
         * 1. Принимает от пользователя и "запоминает" строки.
         * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая последней.
         * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        LinkedList<String> list = new LinkedList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean work = true;
            while (work) {
                System.out.println("Введите значение: ");
                String text = scanner.nextLine();
                switch (text) {
                    case "print":
                        ListIterator<String> listIterator = list.listIterator(list.size());
                        while (listIterator.hasPrevious()) {
                            System.out.println(listIterator.previous());
                        }
                        break;
                    case "exit":
                        System.out.println("Завершение программы");
                        work = false;
                        break;
                    case "revert":
                        list.remove(list.size() - 2);
                        System.out.println("Предыдущий элемент удален");
                        break;
                    default:
                        list.add(text);
                        System.out.println("Элемент добавлен");
                        break;
                }
            }
        }
    }

    static void Task4() {
        /*
         * 1. Написать метод, который принимает массив элементов, помешает их в стэк и выводит на консоль содержимое стэка.
         *
         * 2. Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
         */
        int[] arr = new int[]{2, 5, 6, 8, 9, 4, 1};
        stack(arr);
        System.out.println();
        queue(arr);
    }

    static void stack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    static void queue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}

