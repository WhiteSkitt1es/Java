package lambda;

interface SomeTest<T> {
    boolean test(T n, T m);
}
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeTest<Integer> isFactor = (n, m) -> (n % m) == 0;
        System.out.println(isFactor.test(10, 2));

        System.out.println();

        SomeTest<Double> isFactorD = (n, m) -> (n % m) == 0;
        System.out.println(isFactorD.test(212.0, 4.0));

        System.out.println();

        SomeTest<String> isFactorS = (n, m ) -> n.indexOf(m) != -1;
        System.out.println(isFactorS.test("This is string", "This"));

    }
}
