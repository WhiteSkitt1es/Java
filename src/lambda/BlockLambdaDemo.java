package lambda;

interface NumericFunc {
    int func(int n);
}
public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc nt = (n) -> {
            int result = 1;

            n = n < 0 ? -n : n;

            for (int i = 2; i <= n / i; i++) {
                if ((n % i) == 0) {
                    result = i;
                    break;
                }
            }
            return result;
        };

        System.out.println("Наиментшим делителем числа 12 является число: " + nt.func(12));
        System.out.println("Наиментшим делителем числа 11 является число: " + nt.func(11));
    }
}
