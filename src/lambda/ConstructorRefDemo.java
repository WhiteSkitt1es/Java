package lambda;

interface Myfunc {
    Myclass fuch(String s);
}
interface Myfunc2 {
    Myclass fuch();
}
class Myclass {
    private String str;

    public Myclass(String str) {
        this.str = str;
    }

    public Myclass() {
        this.str = "0";
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        /* Myfunc mf = Myclass::new;

        Myclass mc = mf.fuch("String");

        System.out.println(mc.getStr()); */

        Myfunc2 mf2 = Myclass::new;

        Myclass mc2 = mf2.fuch();

        System.out.println(mc2.getStr());
    }
}
