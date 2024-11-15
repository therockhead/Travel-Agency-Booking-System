public class Main{
    public static void main(String[] args){
        FlightBooking f1 = new FlightBooking("14561232", "Asif", "23TFG678", 2000);

        f1.displayDetails();
        f1.book();

        System.out.println("Total Cost: "+ f1.calculateCost());

        System.out.println("----------------------------------------");
        TrainBooking t1 = new TrainBooking("123456", "Md. Rakib Hassan",
                "231UY98P", 30, 4);

        t1.displayDetails();
        t1.book();
        System.out.println("Total Cost: "+t1.calculateCost());


    }
}