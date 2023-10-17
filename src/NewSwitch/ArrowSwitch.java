package NewSwitch;

public class ArrowSwitch {
    private enum ShipMethod {STANDART, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {
        int id = 5099;

        ShipMethod sm = switch (id) {
            case 1774, 8708, 6709 -> ShipMethod.TRUCK;
            case 4657, 2195, 3621, 1887 -> ShipMethod.AIR;
            case 2907, 5099 -> ShipMethod.OVERNIGHT;
            default -> ShipMethod.STANDART;
        };
        System.out.println("Способ доставки товара с идентифкатором " + id + " : " + sm);
    }
}
