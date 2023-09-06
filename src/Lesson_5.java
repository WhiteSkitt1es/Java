public class Lesson_5 {
    // public static void main(String[] args) {
    //     Map<Integer, String> map = new HashMap<>();
    //     map.put(10, "Ten");
    //     map.put(1, "One");
    //     map.put(2, "Two");
    //     map.put(3, "Three");
    //     map.putIfAbsent(1, "Один"); // - если данный ключ имеется то ничего не будем добавлять 
    //     System.out.println(map);
    //     System.out.println(map.get(1));
    //     System.out.println(map.get(2));
    //     System.out.println(map.get(3)); // - вызов по ключу 
    //     System.out.println(map.containsValue("One")); // - проверка на наличии значение в хеше
    //     System.out.println(map.containsKey(1)); // - проверка на наличии ключа в хеше
    //     System.out.println(map.keySet()); // - вывод всех ключей
    //     System.out.println(map.values()); // - вывод всех значений
    //     /*
    //      * put(K,V)*- добавить пару если или изменить значение, если ключ имеется.
    //      * putIfAbsent (K,V) - произвести добавление если ключ не найден.
    //      * get(K) - получение значения по указанному ключу.
    //      * remove(K) - удаляет пару по указанному ключу.
    //      * containsValue(V) - проверка наличия значения.
    //      * containsKey(V) - проверка наличия ключа.
    //      * keySet() - возвращает множество ключей.
    //      * values() - возвращает набор значений.
    //      */
    // }

    // public static void main(String[] args) {
    //     Map<Integer, String> map = new HashMap<>();
    //     map.put(1, "One");
    //     map.put(2, "Two");
    //     map.put(3, "Three");
    //     System.out.println(map);

    //     for (var item : map.entrySet()) {
    //         System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
    //     }
    // }

    // public static void main(String[] args) {
    //     Map<Integer, String> map = new HashMap<>();
    //     Map<Integer, String> map = new HashMap<>(9); // - начальный размер хеша
    //     Map<Integer, String> map = new HashMap<>(9, 0.75f); // - при загрузке хеша на 0.75% размер хеша увеличится
    // }

    // public static void main(String[] args) {
    //     TreeMap<Integer, String> treeMap = new TreeMap<>();
    //     treeMap.put(1, "One");
    //     treeMap.put(2, "Two");
    //     treeMap.put(3, "Three");
    //     treeMap.put(4, "Four");
    //     System.out.println(treeMap);
    //     System.out.println(treeMap.descendingKeySet());
    //     System.out.println(treeMap.descendingMap());
    // }

    // public static void main(String[] args) {
    //     Map<Integer, String> linkMap = new LinkedHashMap<>();
    //     linkMap.put(10, "Ten");
    //     linkMap.put(1, "One");
    //     linkMap.put(2, "Two");
    //     linkMap.put(3, "Three");
    //     linkMap.put(4, "Four");
    //     System.out.println(linkMap);
    // }
}
