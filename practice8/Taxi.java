public class Taxi implements Meter {
    public int BASE_FARE = 3000;
    
    public void start() {
        System.out.println("gogo");
    }

    public int stop(int distance) {
        int fare = BASE_FARE + distance * 2;
        System.out.println("fare : " + fare);
        return fare;
    }   
}
