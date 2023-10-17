package lambda;

interface IntPredecate {
    boolean test(Num m, int n);
}
class Num {
    private int n;

    public Num(int n) {
        this.n = n;
    }
    public int getN() {
        return n;
    }
    boolean isFactor(int v) {
        return (n % v) == 0;
    }
}
public class MethodRefDemo3 {
    public static void main(String[] args) {
        boolean result;

        Num num1 = new Num(9);
        Num num2 = new Num(10);

        IntPredecate ip = Num::isFactor;

        result = ip.test(num1, 3);
        System.out.println(result);

        result = ip.test(num2, 3);
        System.out.println(result);
    }
}
