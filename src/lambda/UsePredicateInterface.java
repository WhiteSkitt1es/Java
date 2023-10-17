package lambda;

import java.util.function.Predicate;

public class UsePredicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (n) -> (n % 2) == 0;

        System.out.println(isEven.test(4));
    }
}
