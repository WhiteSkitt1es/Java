package Record;

public record Item(String name, int itemNum, double price) {
}
class ItemDemo {
    public static void main(String[] args) {
        Item[] items = new Item[4];

        items[0] = new Item("Hammer", 257, 10.99);
        items[1] = new Item("Wrench", 18, 19.29);
        items[2] = new Item("Drill", 903, 22.25);
        items[3] = new Item("Saw", 27, 34.59);

        for (Item item: items) {
            System.out.println(item.name() + "; Идентификационный номер: " + item.itemNum() + "; Цена: " + item.price());
        }
    }
}
