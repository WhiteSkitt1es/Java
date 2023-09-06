public class ListEdit {

    // Описание методов структуры данных List

    Node head;
    Node tail;

    public Node find(int value) { // Поиск в односвязном списке O(n)
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value) {
                return currentNode;
            }
            currentNode = currentNode.next;
        }
        return null;
    }

    public void add(int value) { // Добавление элемента в конец списка O(1)
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }

    public void add(int value, Node node) { // Добавление элемента в середину списка O(1)
        Node next = node.next;
        Node newNode = new Node();
        newNode.value = value;
        node.next = newNode;
        newNode.previous = node;
        if (next == null) {
            tail = newNode;
        } else {
            next.previous = newNode;
            newNode.next = next;
        }
    }

    public void delete(Node node) {  // Удаление элемента из списка О(n)
        Node previous = node.previous;
        Node next = node.next;
        if (previous == null) {
            next.previous = null;
            head = next;
        } else {
            if (next == null) {
                previous.next = null;
                tail = previous;
            } else {
                previous.next = next;
                next.previous = previous;
            }
        }
    }

    public void revert() { // Разворот списка
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }

    public void recursionRevert() { // Разворот списка методом рекурсии
        if (head != null && head.next != null) {
            Node temp = head;
            recursionRevert(head.next, head);
            temp.next = null;
        }
    }

    private void recursionRevert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            recursionRevert(currentNode.next, previousNode);
        }
        currentNode.next = previousNode;
    }

    public void push(int value) { // Добавление элемента в стэк
        Node node = new Node();
        node.value = value;
        node.next = head;
        head.previous = node;
        head = node;
    }

    public Integer peek() { // Вывод последнего элемента в стэке
        Integer result = null;
        if (tail != null) {
            result = tail.value;
            tail.previous.next = null;
            tail = tail.previous;
        }
        return result;
    }

    public Integer pop() { // Удалить последний элемент из стека
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public class Node {
        int value;
        Node next;
        Node previous;
    }
}
