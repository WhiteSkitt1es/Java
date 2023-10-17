package NewSwitch;
public class TraditionalSwitch {
    private enum ShipMethod {STANDART, TRUCK, AIR, OVERNIGHT}

    public static void main(String[] args) {
        ShipMethod sm;
        int id = 5099;

        switch (id){
            case 1774:
            case 8708:
            case 6709:
                sm = ShipMethod.TRUCK;
                break;
            case 4657:
            case 2195:
            case 3621:
            case 1887:
                sm = ShipMethod.AIR;
                break;
            case 2907:
            case 5099:
                sm = ShipMethod.OVERNIGHT;
                break;
            default:
                sm = ShipMethod.STANDART;
        }
        System.out.println("Способ доставки товара с идентифкатором " + id + " : " +sm);
    }
}
