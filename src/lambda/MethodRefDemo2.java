package lambda;

interface IntPridicate {
    boolean test(int n);
}
class IntNum {
    private int v;

    public IntNum(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}
public class MethodRefDemo2 {
    public static void main(String[] args) {
        boolean result;

        IntNum in1 = new IntNum(12);
        IntNum in2 = new IntNum(16);

        IntPredicate ip = in1::isFactor;

        result = ip.test(3);
        if(result) System.out.println("3 является делителем: " + in1.getV());

        ip = in2::isFactor;

        result = ip.test(3);
        if(!result) System.out.println("3 не является делителем: " + in2.getV());
    }
}
