// Product.java
public class Product {
    private String name;
    private double price; // ราคาต่อชิ้น

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
