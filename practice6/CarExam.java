public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();
        if (car instanceof Machine) {
            System.out.println("Car = Machine");
        }
        else {
            System.out.println("Car Machine nono");
        }
    }
    
}
