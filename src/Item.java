public class Item {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Item(String name, int price) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("name is null or empty");
        }

        this.name = name;
        this.price = price;
    }
}
