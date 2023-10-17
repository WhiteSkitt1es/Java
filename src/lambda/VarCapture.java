package lambda;

interface MyFunc {
    int func(int n);
}
public class VarCapture {
    public static void main(String[] args) {
        final int num = 10; // !

        MyFunc mf = (n) -> {
            int result = 0;

            result = num + n;

            return result;
        };

        System.out.println(mf.func(8));
    }
}
