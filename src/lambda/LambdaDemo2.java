package lambda;

interface NumericTest {
    boolean test (int n, int m);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest idFactor = (n, m) -> (n % m) == 0;

        System.out.println(idFactor.test(10, 2));

        NumericTest lessThan = (n, m) -> (n < m);

        System.out.println(lessThan.test(2, 10));

        NumericTest absEqual = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);

        System.out.println(absEqual.test(4, -4));

    }
}
