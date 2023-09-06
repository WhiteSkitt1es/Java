// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Iterator;
// import java.util.List;

public class Lesson_3 {
    // public static void main(String[] args) {
    //     Object o = "t"; GetType(o);
    // }
    // public static void GetType (Object o) {
    //     System.out.println(o.getClass().getName());
    // }

    // public static void main(String[] args) {
    //     System.out.println(Sum(1, 2));
    //     System.out.println(Sum(1.0, 2));
    //     System.out.println(Sum(1, 2.0));
    //     System.out.println(Sum(1.2, 2.1));
    // }
    // static Object Sum(Object a, Object b){
    //     if (a instanceof Double && b instanceof Double){
    //         return (Object)((Double) a + (Double) b);
    //     } else if (a instanceof Integer && b instanceof Integer){
    //         return (Object)((Integer) a + (Integer) b);
    //     } else return 0; 
    // }

    // public static void main(String[] args) {
    //     int [] a = new int[]{1, 9};
    //     int [] b = new int[3];
    //     System.arraycopy(a, 0, b, 0, a.length);
    //     for (int i : a) {System.out.printf("%d ", i);}
    //     System.out.println();
    //     for (int j : b) {System.out.printf("%d ", j);}
    // }

    // static int[] AddItem(int[] array, int item){
    //     int length = array.length;
    //     int[] temp = new int[length + 1];
    //     System.arraycopy(array, 0, temp, 0, length);
    //     temp[length] = item;
    //     return temp;
    // }
    // public static void main(String[] args) {
    //     int[] a = new int[]{1, 9};
    //     for (int i : a) {System.out.printf("%d ", i);}
    //     System.out.println();
    //     a = AddItem(a, 2);
    //     a = AddItem(a, 8);
    //     for (int j : a) {System.out.printf("%d ", j);}
    // }

    // public static void main(String[] args) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     list.add(123);

    //     for (Integer integer : list) {System.out.println(integer);}
    // }

    // Способы создания
    // ArrayList<Integer> list1 = new ArrayList<Integer> () ;
    // ArrayList<Integer> list2 = new ArrayList<> ();
    // ArrayList<Integer> list3 = new ArrayList<> (10);
    // ArrayList<Integer> list4 = new ArrayList<>(list3);

    // Функционал

    // add(args) - добавляет элемент в список ( в т.ч. на нужную позицию)
    // get(pos) - возвращает элемент из списка по указанной позиции
    // indexOf(item) - первое вхождение или -1
    // lastIndexOf(item) - последнее вхождение или -1
    // remove(pos) - удаление элемента на указанной позиции и его возвращение
    // set(int pos, T item) - помещает энчние item элементу, который находится
    // void sort(Comparator) - сортирует набор данных по правилу
    // subList(int start, int end) - получение набора данных от позиции start до end
    // clear() - очистка списка
    // toString() - «конвертация» списка в строку
    // Arrays.asList - преобразует массив в список
    // containsAll(col) - проверяет включение всех элементов из соl
    // removeAll(col) - удаляет элементы, имеющиеся в col
    // retainAll(col) - оставляет элементы, имеющиеся в соl
    // toArray() - конвертация списка в массив Object'oB
    // toArray(type array) - конвертация списка в массив type
    // List.copy0f(col) - возвращает копию списка на основе имеющегося
    // List.of(item1, item2,..) - возвращает неизменяемый список

    // public static void main(String[] args) {
    //     StringBuilder day = new StringBuilder("28");
    //     StringBuilder mounth = new StringBuilder("9");
    //     StringBuilder year = new StringBuilder("1990");
    //     StringBuilder[] date = new StringBuilder[]{day, mounth, year};
    //     List<StringBuilder> d = Arrays.asList(date);
    //     System.out.println(d);
    //     date[1] = new StringBuilder("09");
    //     System.out.println(d);
    // }

    // public static void main(String[] args) {
    //     /*
    //      * Итерация
    //      */
    //     List <Integer> list = List.of(1, 2, 3, 4, 5, 6);

    //     for (Integer i : list) {System.out.println(i);}

    //     Iterator <Integer> col = list.iterator();
    //     System.out.println();

    //     while (col.hasNext()){
    //         System.out.println(col.next());
    //     }
    //     // .next()
    //     // .hasNext()
    //     // .remove()
    // }
}