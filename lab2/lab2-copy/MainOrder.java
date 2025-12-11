// MainOrder.java
public class MainOrder {
    public static void main(String[] args) {
        // สินค้าในร้าน
        Product notebook = new Product("สมุดโน้ต", 45.0);
        Product pen = new Product("ปากกาเจล", 15.0);

        // ใบสั่งซื้อ (สมมติ)
        OrderItem item1 = new OrderItem(notebook, 3, 10); // สมุด 3 เล่ม ลด 10%
        OrderItem item2 = new OrderItem(pen, 5, 0);       // ปากกา 5 แท่ง ไม่ลด

        System.out.println("รายละเอียดคำสั่งซื้อ:");
        item1.printDetail();
        item2.printDetail();

        double grandTotal = item1.calculateTotal() + item2.calculateTotal();
        System.out.println("ยอดชำระทั้งหมด: " + grandTotal + " บาท");
    }
}
