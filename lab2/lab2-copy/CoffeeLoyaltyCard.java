// CoffeeLoyaltyCard.java
public class CoffeeLoyaltyCard {
    // attributes (field / property)
    private String customerName;
    private int points;
    private double totalSpent;

    // constructor
    public CoffeeLoyaltyCard(String customerName) {
        this.customerName = customerName;
        this.points = 0;
        this.totalSpent = 0.0;
    }

    // method สำหรับบันทึกยอดซื้อ
    public void addPurchase(double amount) {
        totalSpent += amount;

        // ทุก 50 บาทได้ 1 แต้ม
        int earnedPoints = (int)(amount / 50);
        points += earnedPoints;

        System.out.println(customerName + " ซื้อ " + amount + " บาท ได้เพิ่ม " 
                           + earnedPoints + " แต้ม");
    }

    // method ใช้แต้มแลกส่วนลด
    public double redeemDiscount() {
        if (points >= 10) {
            points -= 10;
            System.out.println("ใช้แต้ม 10 แต้ม แลกส่วนลด 50 บาท");
            return 50.0;
        } else {
            System.out.println("แต้มไม่พอ (มี " + points + " แต้ม)");
            return 0.0;
        }
    }

    // method แสดงข้อมูลบัตร
    public void printSummary() {
        System.out.println("ลูกค้า: " + customerName);
        System.out.println("ยอดซื้อสะสม: " + totalSpent + " บาท");
        System.out.println("แต้มคงเหลือ: " + points);
    }
}
