package Enumeration;

public enum Transports {
    CAR(65), TRUCK(50), AIRPLANE(600), TRAIN(70), BOAT(22);
    private int speed;

    Transports(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return speed;
    }
}
class EnumDemo {
    public static void main(String[] args) {

        /*Transports tp;
        System.out.println("Типичная скорость самолета: " + Transports.AIRPLANE.getSpeed());

        System.out.println("Типичные скорости движения транспортных средств: ");
        for (Transports transports:Transports.values()) {
            System.out.println(transports + ": " + transports.getSpeed());
        } */
        Transports tp1, tp2, tp3;

        System.out.println("Константы перечисления и их порядковые номера");
        for (Transports ts: Transports.values()){
            System.out.println(ts + ": " + ts.ordinal());
        }

        tp1 = Transports.CAR;
        tp2 = Transports.TRUCK;
        tp3 = Transports.CAR;

        if(tp1.compareTo(tp2) < 0) {
            System.out.println("Позиция " + tp1 + " меньше чем у " + tp2);
        }
        if(tp2.compareTo(tp1) > 0) {
            System.out.println("Позиция " + tp1 + " меньше чем у " + tp2);
        }
        if (tp1.compareTo(tp3) == 0) {
            System.out.println("Позиции " + tp1 + " и " + tp3 + " совпадают");
        }

    }
}

