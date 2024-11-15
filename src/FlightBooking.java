public class FlightBooking extends TransportBooking implements Refundable{
    String flightNumber;
    double ticketPrice;

    public FlightBooking(){
        flightNumber = null;
        ticketPrice = 0.000;
    }
    public FlightBooking(String bookingID, String passengerName, String flightNumber, double ticketPrice){
        super(bookingID, passengerName);
        this.flightNumber = flightNumber;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void refund() {
        System.out.println("Refund for flight #"+ flightNumber + " has been issued");
    }

    @Override
    public void book() {
        System.out.println("Flight " + flightNumber + " has been booked for " + getPassengerName());
    }

    @Override
    public double calculateCost() {
        return ticketPrice;
    }

    void displayDetails() {
        System.out.println("Booking ID: " + getBookingID());
        System.out.println("Passenger Name: " + getPassengerName());
        System.out.println("Flight Number: "+ flightNumber);
        System.out.println("Ticket Price: "+ ticketPrice + " BDT");
    }
}
