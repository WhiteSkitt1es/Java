package generalization;
class TwoGen<T, V> {
    T ob1;
    V ob2;
    TwoGen(T ob1, V ob2){
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
    void showType(){
        System.out.println("Type T the: " + ob1.getClass().getName());
        System.out.println("Type V the: " + ob2.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2() {
        return ob2;
    }
}
public class SimGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tg = new TwoGen<>(300, "Tree hundred");
        tg.showType();
        int num = tg.getOb1();
        System.out.println("Value: " + num);
        String str = tg.getOb2();
        System.out.println("Value: " + str);
    }
}
