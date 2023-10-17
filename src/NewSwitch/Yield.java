package NewSwitch;

public class Yield {
    private enum ShipMethod {STANDART, TRUCK, AIR, OVERNIGHT}
    public static void main(String[] args) {

        int id = 5099;

        ShipMethod sm = switch (id) {
            case 1774, 8708, 6709:
                yield  ShipMethod.TRUCK;
            case 4657, 2195, 3621, 1887:
                yield  ShipMethod.AIR;
            case 2907, 5099:
                yield  ShipMethod.OVERNIGHT;
            default:
                yield ShipMethod.STANDART;
        };
        System.out.println("Способ доставки товара с идентифкатором " + id + " : " + sm);
    }
}
