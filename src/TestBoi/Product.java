package TestBoi;

public class Product implements Item {
    private String name;
    private String manufacturer;
    private Item type;

    Product(String n, String m, Item t) {
        name = n;
        manufacturer = m;
        type = t;
    }

    public String toString() {
        return "Name: " + name + "\nManufacturer: " + manufacturer + "\nType: " + type;
    }
}

class Widget extends Product {
    Widget(String n, String m, Item t) {
        super(n, m, t);
    }
}