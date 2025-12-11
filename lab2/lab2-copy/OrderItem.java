// OrderItem.java
public class OrderItem {
    private Product product;
    private int quantity;
    private double discountPercent; // ส่วนลดเป็น %

    public OrderItem(Product product, int quantity, double discountPercent) {
        this.product = product;
        this.quantity = quantity;
        this.discountPercent = discountPercent;
    }

    public double calculateTotal() {
        double subtotal = product.getPrice() * quantity;
        double discountAmount = subtotal * (discountPercent / 100.0);
        return subtotal - discountAmount;
    }

    public void printDetail() {
        System.out.println(
            product.getName() + " x " + quantity +
            " | ราคา/ชิ้น " + product.getPrice() +
            " | ส่วนลด " + discountPercent + "%" +
            " | รวมสุทธิ " + calculateTotal() + " บาท"
        );
    }
}
