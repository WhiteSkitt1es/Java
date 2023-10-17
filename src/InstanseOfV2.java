public class InstanseOfV2 {
    public static void main(String[] args) {
        Number nOb = Integer.valueOf(11);
        if(nOb instanceof Integer iOb) {
            System.out.println("iOb ссылается на целове число: " + iOb);
        }
        if (nOb instanceof Integer) {
            Integer intOb = (Integer) nOb;
            System.out.println("iOb ссылается на целове число: " + intOb);
        }
    }
}
