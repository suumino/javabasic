public class TaxiExam {
    public static void main(String [] args) {
        Taxi taxi = new Taxi();
        // System.out.println("Before");
        // taxi.stop(20);
        // taxi.BASE_FARE = 2500;
        // System.out.println("After");
        // taxi.stop(20);
        taxi.start();
        taxi.afterMidnight();
        taxi.stop(10);
    }  
}
