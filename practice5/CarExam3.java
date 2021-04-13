public class CarExam3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("car1");
        Car c3 = new Car("car2", 1111);

        System.out.println(c1.name + " " + c1.number);
        System.out.println(c2.name + " " + c2.number);
        System.out.println(c3.name + " " + c3.number);
    }
    
}
