public class BusExam {
    public static void main(String []args) {
        Bus bus = new Bus("gogo", 3000, 1050);
        if (bus.name != "gogo") {
            System.out.println("bus name nono");
        }
        else if (bus.number != 3000) {
            System.out.println("bus number nono");
        }
        else if (bus.fee != 1050) {
            System.out.println("bus fee nono");
        }
        else {
            System.out.println("ok good");
        }
    }
    
}
