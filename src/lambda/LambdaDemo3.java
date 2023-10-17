package lambda;

interface StringTest {
    boolean test(String aStr, String bStr);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        StringTest st = (String a, String b) -> a.indexOf(b) != -1;

        String str = "This test";

        System.out.println("Testing string: " + str);
        System.out.println(st.test(str, "This"));

        System.out.println(st.test(str, "test"));

        System.out.println(st.test(str, "qwerty"));
    }
}
