package Record;

public record Item2(String name, int itemNum, double price) {
    public Item2 {
        name = name.trim();
    }
}
class RecordDemo {
    public static void main(String[] args) {
        Item2[] items = new Item2[4];

        items[0] = new Item2("  Hammer  ", 257, 10.99);
        items[1] = new Item2(" Wrench  ", 18, 19.29);
        items[2] = new Item2("   Drill", 903, 22.25);
        items[3] = new Item2("Saw   ", 27, 34.59);

        for (Item2 item: items) {
            System.out.println(item.name() + "; Идентификационный номер: " + item.itemNum() + "; Цена: " + item.price());
        }
    }
}
