import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Test_code {
    public static void main(String[] args) throws java.io.IOException {
        /* char ch, ignore, answer = 'S';

        do {
            System.out.println("Задумана буква из диапазона A-Z");
            System.out.println("Попробуйте ее угадать: ");
            ch = (char) System.in.read();
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
            if (ch == answer) System.out.println("*** Правильно! ***");
            else {
                System.out.print("...Извините нужная буква находится ");
                if (ch < answer) System.out.println("ближе к концу алфавита");
                else System.out.println("ближе к началу алфавита");
                System.out.println("Повторите попытку снова!\n");
            }
        } while (answer != ch); */

        /*for (int i = 1; i <= 3; i++) {
            one : {
                two : {
                    three : {
                        System.out.println("\ni равно " + i);
                        if (i == 1) break one;
                        if (i == 2) break two;
                        if (i == 3) break three;
                    }
                    System.out.println("После блока three");
                }
                System.out.println("После блока two");
            }
            System.out.println("После блока one");
        }
        System.out.println("После цикла for");*/

        /*outerloop:
            for (int i = 1; i < 10; i++) {
                System.out.print("\nВнешний цикл: проход " + i + ", внутренний цикл: ");
                for (int j = 1; j < 10; j++){
                    if (j == 5) continue outerloop;
                    System.out.print(j);
                }
            }*/
        /* char ch, ignore;
        do {
            System.out.print("Введите букву верхнего регистра: ");
            ch = (char) System.in.read();
            if(ch != '.'){
                ch += 32;
            }
            System.out.println(ch);
            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');
        } while (ch != '.');
        System.out.println("Завершение программы"); */
       /* char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('a' + i);
            System.out.print(ch);

            ch = (char) ((int) ch & 65503);
            System.out.print(ch + " ");
        }*/
        /* char ch;
        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            ch = (char) ((int) ch | 65503);
            System.out.print(ch + " ");
        }*/
        /* String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 88;

        System.out.print("Исходное сообщение: ");
        System.out.println(msg);

        for (int i = 0; i < msg.length(); i++) {
            encmsg +=  (char) (msg.charAt(i) ^ key);
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        for (int i = 0; i < msg.length(); i++) {
            decmsg +=  (char) (encmsg.charAt(i) ^ key);
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
         */
        /*byte b = -34;
        for(int t = 128; t > 0; t = t/2) {
            if ((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        b = (byte) ~b;

        for(int t = 128; t > 0; t = t/2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
         */
        /* int result;

        for (int i = -5; i < 6; i++) {
            result = i != 0 ? 100 / i : 0;
            if (result != 0){
                System.out.println("100 / " + i + " равно " + result);
            }
        }
         */
        X num1 = new X(2);
        Y num2 = new Y(2,2);
        Z num3 = new Z(2,2,2);

        X x;

        x = num1;
        x.show();
    }

    public static void printNums(int i){
        System.out.println(i);
    }
    public static int printNums(int i, int j){
        return i;
    }


}
class X {
    private int x;
    X(int x){
        this.x = x;
    }
    X(X x){
        this.x = x.x;
    }
    public int getX() {
        return x;
    }
    public void show(){
        System.out.println(x);
    }
}
class Y extends X{
    private int y;
    Y(int x, int y){
        super(x);
        this.y = y;
    }
    Y(Y y){
        super(y);
        this.y = y.y;
    }
    public int getY() {
        return y;
    }
    public void show(){
        super.show();
        System.out.println(y);
    }
}
class Z extends Y{
    private int z;
    Z(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
    Z(Z z){
        super(z);
        this.z = z.z;
    }
    public int getZ() {
        return z;
    }
    public void show(){
        super.show();
        System.out.println(z);
    }
}

