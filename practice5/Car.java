public class Car {
    int number;
    String name;

    public Car() {
        //this.name = "no name";
        //this.number = 0;
        this("noname", 0);
    }
    public Car(String name) {
        this(name, 0);
    }
    public Car(String name, int number) {
        this.name = name;
        this.number = number;
    }
    
    public void run() {
        System.out.println("run");
    }
}


