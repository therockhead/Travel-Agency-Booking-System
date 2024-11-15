abstract class TransportBooking {
    private String bookingID;
    private String passengerName;

    String getBookingID(){
        return bookingID;
    }
    String getPassengerName(){
        return passengerName;
    }

    TransportBooking(){
        bookingID = null;
        passengerName = null;
    }
    TransportBooking(String bookingID, String passengerName){
        this.bookingID = bookingID;
        this.passengerName = passengerName;
    }
    public abstract void book();
    public abstract double calculateCost();

    void displayDetails() {
        System.out.println("Booking ID: " + bookingID);
        System.out.println("Passenger Name: " + passengerName);
    }
}
