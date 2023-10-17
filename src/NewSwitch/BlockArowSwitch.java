package NewSwitch;

public class BlockArowSwitch {
    private enum ShipMethod {STANDART, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {
        int id = 5099;

        boolean extraCharge;

        ShipMethod sm = switch (id) {
            case 1774, 8708, 6709 -> {
                extraCharge = true;
                yield ShipMethod.TRUCK; }
            case 4657, 2195, 3621, 1887 -> {
                extraCharge = false;
                yield ShipMethod.AIR;
            }
            case 2907, 5099 -> {
                extraCharge = true;
                yield ShipMethod.OVERNIGHT;
            }
            default -> {
                extraCharge = false;
                yield ShipMethod.STANDART;
            }
        };
        System.out.println("Способ доставки товара с иденти фкатором " + id + " : " + sm);
        if(extraCharge) System.out.println("Требуется дополнительная оплата");
    }
}