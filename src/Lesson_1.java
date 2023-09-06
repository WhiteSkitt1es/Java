public class Lesson_1 {
    // public static void main(String[] args) {
    //     String x = "hello world";
    //     int y = 123;
    //     double z = 3.14;
    //     System.out.println();
    // }

    // public static void main(String[] args) {
    //     char x = 67; // 67 - номер символа по стандарту Unicode таблицы ASCII
    //     char y = 'a';
    //     char z = 116;
    //     System.out.println("Слово из трех букв: " + x + y + z);
    // }

    // public static void main(String[] args) {
    //     boolean x = true ^ false;
    //     boolean y = false && true;
    //     boolean z = false || false;
    //     System.out.println(z);
    // }

    // public static void main(String[] args) {
    //     var x = 123; // - неявный тип данных
    //     var y = 12.456;
    //     var z = "hello";
    //     System.out.println(getType(x));
    //     System.out.println(getType(y));
    //     System.out.println(getType(z));
    // }
    // static String getType (Object o) {
    //     return o.getClass().getSimpleName();
    // }

    // public static void main(String[] args) {
    //     String x = "abcdefg";
    //     System.out.println(x.length());
    //     System.out.println(x.charAt(6));
    // }

    // public static void main(String[] args) {
    //     int x = 0;
    //     int y = x-- - --x;
    //     System.out.println(y);
    // }

    // public static void main(String[] args) {
    //     int x = 8;
    //     System.out.println(x << 2); // - побитовый сдвиг в двоичной системе счисления 8 = 1000 << 1 = 10000
    // }

    // public static void main(String[] args) {
    //     int a = 5;
    //     int b = 2;
    //     System.out.println(a | b); // - побитовое сравнение в двоичной системе счисления
    //     // 101
    //     // 010
    //     // 111
    //     System.out.println(a & b);
    //     // 101
    //     // 010
    //     // 000
    //     System.out.println(a ^ b);
    //     // 101
    //     // 010
    //     // 111
    //}

    // public static void main(String[] args) {
    //     int[] array = new int[]{1,2}; // - Одномерный массив
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(array[i]);
    //     }
    // }

    // public static void main(String[] args) {
    //     int [][] array = new int[3][5]; // - Двухмерный массив
    //     for (int[] line : array) {
    //         for (int item : line) {
    //             System.out.printf("%d",item);
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void main(String[] args) {
    //     int x = 123; double y = 12.3;
    //     System.out.println(x);
    //     System.out.println(y);
    //     x = (int)y; // - присвоение возможно только так
    //     y = Integer.parseInt("123"); // - или так 
    //     System.out.println(y);
    // }

    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("name: ");
    //     String name = iScanner.nextLine();
    //     System.out.printf("Привет, %s!", name);
    //     iScanner.close();
    // }

    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("int a: ");
    //     int x = iScanner.nextInt();
    //     System.out.printf("double b: ");
    //     double y = iScanner.nextDouble();
    //     System.out.printf("%d + %f = %f", x, y, x + y );
    //     iScanner.close();
    // }

    // public static void main(String[] args) {
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.printf("int a: ");
    //     boolean flag = iScanner.hasNextInt();
    //     System.out.println(flag);
    //     int x = iScanner.nextInt();
    //     System.out.println(x);
    //     iScanner.close();
    // }

    // public static void main(String[] args) {
    //     int a = 1, b = 2;
    //     int c = a + b;
    //     String res = a + " + " + b + " = " + c; // Формативный вывод
    //     System.out.println(res);
    // }

    // public static void main(String[] args) {
    //     int a = 1, b = 2;
    //     int c = a + b;
    //     System.out.printf("%d + %d = %d \n", a, b, c);
    //     String res = String.format("%d + %d = %d \n", a, b, c );
    //     System.out.println(res);
    //     %d - для целочисленных значений
    //     %x - для вывода шестнадцатиричных чисел
    //     %f - для вывода чисел с плавающей точкой
    //     %.2f - 3,14
    //     %.3f - 3,141
    //     %e - для вывода чисел в экспонициальной форме
    //     %с - для вывода одиночного символа
    //     %s - для вывода строковых значений
    // }

    // public static void main(String[] args) {
    //     int x = 123;
    //     printInt(x);
    // }
    // public static void printInt(int x) {
    //     System.out.println(x);
    // }

    // public static void main(String[] args) {
    //     int x = 34;
    //     int y = 56;
    //     if (x > y){
    //         System.out.println(x);
    //     } else {
    //         System.out.println(y);
    //     }
    // }

    // public static void main(String[] args) {
    //     int x = 123;
    //     int y = 321;
    //     if (x > y) System.out.println(x);
    //     else System.out.println(y);
    // }

    // public static void main(String[] args) {
    //     int num = 0;
    //     switch (num) {
    //         case 1:
    //             System.out.println("a");
    //             break;

    //         case 2:
    //             System.out.println("b");
    //             break;
    //     }
    // }

    // public static void main(String[] args) {
    //     try (FileWriter file = new FileWriter("file.txt", false)) { // Запись файла
    //         file.write("line 1");
    //         file.append('\n');
    //         file.append('2');
    //         file.append('\n');
    //         file.write("line 3");
    //         file.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }

    // public static void main(String[] args) throws Exception{
    //     BufferedReader br = new BufferedReader(new FileReader("file.txt")); // Вывод данных из файла построчно
    //     String str;
    //     while ((str = br.readLine()) != null) {
    //         System.out.printf("%s \n", str);
    //     }
    //     br.close();
    // }
}