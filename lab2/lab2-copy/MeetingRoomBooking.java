public class MeetingRoomBooking {
    private String roomName;
    private String bookedBy;
    private String date;      // ควรเป็น LocalDate จริง ๆ แต่ใช้ String ให้เด็กปี 1 เข้าใจก่อน
    private String timeSlot;  // เช่น "13:00-15:00"
    private boolean approved; // สถานะอนุมัติ

    public MeetingRoomBooking(String roomName, String bookedBy, String date, String timeSlot) {
        this.roomName = roomName;
        this.bookedBy = bookedBy;
        this.date = date;
        this.timeSlot = timeSlot;
        this.approved = false; // เริ่มต้นยังไม่อนุมัติ
    }

    public void approve() {
        approved = true;
        System.out.println("การจองห้อง " + roomName + " ได้รับการอนุมัติแล้ว");
    }

    public void printInfo() {
        System.out.println("ห้อง: " + roomName);
        System.out.println("ผู้จอง: " + bookedBy);
        System.out.println("วันที่: " + date + " เวลา: " + timeSlot);
        System.out.println("สถานะ: " + (approved ? "อนุมัติแล้ว" : "รออนุมัติ"));
    }
}
