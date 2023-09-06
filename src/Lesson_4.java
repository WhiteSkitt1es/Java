public class Lesson_4 {

    // private static boolean isDigit(String s) throws NumberFormatException {
    //     try {
    //         Integer.parseInt(s);
    //         return true;
    //     } catch (NumberFormatException e) {
    //         return false;
    //     }
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Двухсвязный список
    //      */
    //     LinkedList<Integer> ll = new LinkedList<>();

    //     ll.add(1);
    //     ll.add(12);
    //     ll.add(123);

    //     System.out.println(ll.get(0));
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Очередь - кто первее пришел, тот первый и будте обработан.
    //      */
    //     Queue <Integer> queue = new LinkedList<>();

    //     queue.add(12345);
    //     queue.add(1234);
    //     queue.add(123);
    //     queue.add(12);

    //     queue.remove();

    //     System.out.println(queue);
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Приоритетная очередь - наивысший приоритет имеет "наименьщий" элемент.
    //      */
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();

    //     pq.add(1);
    //     pq.add(12);
    //     pq.add(123);
    //     pq.add(12);
    //     pq.add(1);

    //     System.out.println(pq);
    //     System.out.println(pq.poll());
    //     System.out.println(pq.poll());
    //     System.out.println(pq.poll());
    //     System.out.println(pq.poll());
    //     System.out.println(pq);
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Decue - линейная коллекция, которая поддерживает вставку и удаление элементов на обоих концах.
    //      */
    //     Deque<Integer> deque = new ArrayDeque<>();

    //     deque.add(1);
    //     deque.add(12);
    //     deque.add(123);
    //     deque.add(12);
    //     deque.add(1);
    //     System.out.println(deque);
    //     deque.addFirst(0);
    //     deque.addLast(0);
    //     System.out.println(deque);
    //     deque.offerFirst(0);
    //     deque.offerLast(0);
    //     System.out.println(deque);
    //     deque.removeFirst();
    //     deque.removeLast();
    //     System.out.println(deque);
    //     deque.pollFirst();
    //     deque.pollLast();
    //     System.out.println(deque);
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Stack - кто ранее пришел тот позднее и будет обработан.
    //      */
    //      //var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
    //      var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
    //      int res = 0;
    //      System.out.println(exp);

    //      Stack<Integer> stack = new Stack<>();
    //      for (int i = 0; i < exp.length; i++) {
    //         if(isDigit(exp[i])){
    //             stack.push(Integer.parseInt(exp[i]));
    //         } else {
    //             switch (exp[i]) {
    //                 case "+":
    //                     res = stack.pop() + stack.pop();
    //                     stack.push(res);
    //                     break;
    //                 case "-":
    //                     res = -stack.pop() + stack.pop();
    //                     stack.push(res);
    //                     break;
    //                 case "*":
    //                     res = stack.pop() * stack.pop();
    //                     stack.push(res);
    //                     break;
    //                 case "/":
    //                     res = stack.pop() / stack.pop();
    //                     stack.push(res);
    //                     break;
    //                 default:
    //                     break;
    //             }
    //         }
    //      }
    //      System.out.println(res);
    // }
}