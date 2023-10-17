package Record;

public record Item3(String name, int itemNum, double price) {
    public Item3(String name, int itemNum, String price) {
        this(name, itemNum,Double.parseDouble(price));
    }
}
class RecordDemo2 {
    public static void main(String[] args) {
        Item3[] items = new Item3[4];

        items[0] = new Item3("Hammer", 257, 10.99);
        items[1] = new Item3("Wrench", 18, 19.29);
        items[2] = new Item3("Drill", 903, "22.25");
        items[3] = new Item3("Saw", 27, "34.59");

        for (Item3 item: items) {
            System.out.println(item.name() + "; Идентификационный номер: " + item.itemNum() + "; Цена: " + item.price());
        }
    }
}
