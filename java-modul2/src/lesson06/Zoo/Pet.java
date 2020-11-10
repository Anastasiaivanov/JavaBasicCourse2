package lesson06.Zoo;

abstract class Pet {
    String name;
    String color;
    String breed;

    public Pet(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    abstract void moves();

    protected void eats() {
        System.out.println("3 times a day");
    }
}

class Dog extends Pet {

    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    @Override
    void moves() {
        this.walk();
    }

    void walk() {
        System.out.println(name + " go for a walk");
    }
}

class Duck extends Pet {

    public Duck(String name, String color, String breed) {
        super(name, color, breed);
    }

    void moves() {
        this.flies();
    }

    void flies() {
        System.out.println("Fly duck " + name);
    }

    @Override
    protected void eats() {
        super.eats();
        System.out.println("After eating go for a walk");
    }
}

class Dragon extends Pet {

    public Dragon(String name, String color, String breed) {
        super(name, color, breed);
    }

    public void fire() {
        System.out.println(name + " breathing fire!");
    }

    @Override
    void moves() {
        this.fire();
    }
}

class Test {
    public static void main(String[] args) {
        Pet pet = new Duck("Donald", "grey", "Disney");
        Duck duck = new Duck("Daisy", "white-grey", "Disney");
        Pet scooby = new Dog("Puppy", "white", "Malteser");
        Pet skrudg = new Duck("Skrudg", "brown", "Disney");
        Pet gorinich = new Dragon("Gorinich", "black", "Bad guy");

        gorinich.moves();
        skrudg.moves();
        scooby.moves();
    }
}
