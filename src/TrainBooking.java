public class TrainBooking extends TransportBooking implements Refundable{
    String trainNumber;
    double farePerSeat;
    int numberOfSeats;

    public TrainBooking(String bookingID, String passengerName, String trainNumber,
                        double farePerSeat, int numberOfSeats){
        super(bookingID, passengerName);
        this.trainNumber = trainNumber;
        this.farePerSeat = farePerSeat;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void refund() {
        System.out.println("Refund for The Train #"+ trainNumber + "has been issued");
    }

    @Override
    public void book() {
        System.out.println("Train "+ trainNumber+ " has been booked for "+ getPassengerName());
    }

    @Override
    public double calculateCost() {
        return farePerSeat * numberOfSeats;
    }

    void displayDetails() {
        System.out.println("Booking ID: " + getBookingID());
        System.out.println("Passenger Name: " + getPassengerName());
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Fare per Seat: "+ farePerSeat);
        System.out.println("Number of Seats Booked: "+ numberOfSeats);
    }

}
