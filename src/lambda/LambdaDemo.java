package lambda;

interface MyValue {
    double getValue();
}
interface MyParamValue {
    double getValue(double v);
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyValue mv = () -> 98.6;

        System.out.println("Постоянное значение: " + mv.getValue());

        MyParamValue mpv = (n) -> 1 / n;

        System.out.println("Обратная величина 4.0 равна: " + mpv.getValue(4.0));
        System.out.println("Обратная величина 8.0 равна: " + mpv.getValue(8.0));
    }
}
