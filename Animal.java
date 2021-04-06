class Animal {
    String name;

    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby");
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("happy");
        System.out.println(dog.name);

        Animal horse = new Animal();
        horse.setName("Nabi");
        System.out.println(horse.name);
        Animal rabbit = new Animal();
        rabbit.setName("mija");
        System.out.println(rabbit.name);
    }
}