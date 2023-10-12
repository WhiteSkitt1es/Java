package generalization;

public class Pair<T, V extends T> {
    T first;
    V second;

    public Pair(T first, V second){
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void showT(){
        System.out.println(first.getClass().getName());
    }
    public void showV(){
        System.out.println(second.getClass().getName());
    }
}
class PairDemo {
    public static void main(String[] args) {
        Pair<Number, Integer> pair = new Pair<>(1,2);
        Pair<Integer, Integer> pair1 = new Pair<>(1,2);
        pair.showT();
        pair.showV();
    }
}
