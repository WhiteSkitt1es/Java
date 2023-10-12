package generalization;

public interface IGenQ<T> {
    void put(T ch) throws QueueFullExceptions;
    T get() throws QueueEmptyExceptions;
}
class QueueFullExceptions extends Exception {
    int size;

    QueueFullExceptions(int size){
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nОчередь заполнена. Элемент не добавлен. Максимальный размер очереди: " + size;
    }
}
class QueueEmptyExceptions extends Exception {
    @Override
    public String toString() {
        return "\nОчередь пуста";
    }
}
class GenQueue<T> implements IGenQ<T> {
    private T[] q;
    private int putLoc, getLoc;

    public GenQueue(T[] q) {
        this.q = q;
        putLoc = getLoc = 0;
    }

    @Override
    public void put(T ch) throws QueueFullExceptions {
        if(putLoc == q.length - 1) {
            throw new QueueFullExceptions(q.length);
        }
        q[putLoc++] = ch;
    }

    @Override
    public T get() throws QueueEmptyExceptions {
        if (getLoc == putLoc) {
            throw new QueueEmptyExceptions();
        }
        return q[getLoc++];
    }
}
class GenQDemo {
    public static void main(String[] args) {
        Integer[] iStore = new Integer[10];
        GenQueue<Integer> genQueue = new GenQueue<>(iStore);

        Integer iValue;

        System.out.println("Демонстрация очереди чисел типа Integer");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Добавление " + i + " в очередь genQueue");
                genQueue.put(i);
            }
        } catch (QueueFullExceptions exceptions) {
            System.out.println(exceptions.toString());
        }

        System.out.println();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.print("Получение следующего числа типа Integer из очереди genQueue: ");
                iValue = genQueue.get();
                System.out.println(iValue);
            }
        } catch (QueueEmptyExceptions exceptions) {
            System.out.println(exceptions.toString());
        }

    }
}
