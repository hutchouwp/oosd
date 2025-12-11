// MainCoffee.java
public class MainCoffee {
    public static void main(String[] args) {
        CoffeeLoyaltyCard card = new CoffeeLoyaltyCard("คุณเอ");

        card.addPurchase(120);  // ซื้อ 120 บาท
        card.addPurchase(80);   // ซื้อ 80 บาท

        card.printSummary();

        double discount = card.redeemDiscount();
        System.out.println("ส่วนลดที่ได้รับ: " + discount + " บาท");

        card.printSummary();
    }
}
