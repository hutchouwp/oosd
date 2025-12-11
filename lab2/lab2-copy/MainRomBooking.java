public class MainRomBooking{
    public static void main(String [] args){
        MeetingRoomBooking Booking = new MeetingRoomBooking("736","Watsaphon","17/02/2025","13:00-15:00");
    
        Booking.approve();
        Booking.printInfo();
        
    }
}
