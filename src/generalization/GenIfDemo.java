package generalization;

interface Contaiment<T> {
    boolean contains(T o);
}

class MyClass<T> implements Contaiment<T> {
    T[] arrayRef;

    public MyClass(T[] arrayRef) {
        this.arrayRef = arrayRef;
    }

    @Override
    public boolean contains(T o) {
        for ( T x : arrayRef){
            if (x.equals(o)){
                return true;
            }
        }
        return false;
    }
}

public class GenIfDemo {
    public static void main(String[] args) {
        Integer[] x = {1, 2, 3, 4, 5};

        MyClass<Integer> ob = new MyClass<>(x);

        System.out.println(ob.contains(2));

        System.out.println(ob.contains(3));

        System.out.println(ob.contains(9));
    }
}
