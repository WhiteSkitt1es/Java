package generalization;

class Gen<T> {
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Type T the: " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<>(100);
        iOb.showType();
        int num = iOb.getOb();
        System.out.println("Value: " + num);

        Gen<String> sOb = new Gen<>("String");
        sOb.showType();
        String str  = sOb.getOb();
        System.out.println("Value: " + str);
    }
}
