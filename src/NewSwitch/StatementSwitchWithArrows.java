package NewSwitch;

public class StatementSwitchWithArrows {
    public static void main(String[] args) {
        int line1count = 0;
        int line2count = 0;
        int line3count = 0;

        int productionLine;

        for (int i = 1; i < 10; i++) {
            productionLine = (i % 3) + 1;
            switch (productionLine){
                case 1 -> {
                    line1count++;
                    System.out.println("Линия 1 выпустила одну единицу продкции");
                }
                case 2 -> {
                    line2count++;
                    System.out.println("Линия 2 выпустила одну единицу продкции");
                }
                case 3 -> {
                    line3count++;
                    System.out.println("Линия 3 выпустила одну единицу продкции");
                }
            }
        }
        System.out.printf("Общее количество единиц продукции, выпущеные линиями 1, 2 и 3: %d, %d, %d.",
                line1count, line2count, line3count);
    }
}
