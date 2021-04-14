public class MeterExam {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        boolean a = Meter.class.isInstance(taxi);
        if (a != true) {
            System.out.println("need Meter interface");
        }
        else if (taxi.stop(200) != 400) {
            System.out.println("stop(200) = 400");
        }
        else {
            System.out.println("ok good");
        }
    }
    
}
