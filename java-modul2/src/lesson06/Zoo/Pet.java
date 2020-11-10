package lesson06.Zoo;

abstract class Pet {
    String name;

    public Pet(String name) {
        this.name = name;
    }

    abstract void moves();

    protected void eats() {
        System.out.println("3 times a day");
    }

}

class Duck extends Pet {

    public Duck(String name) {
        super(name);
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

class Test {
    public static void main(String[] args) {
        Pet pet = new Duck("Donald");
        Duck duck = new Duck("Daisy");
        pet.moves();
        duck.moves();
        Object ob = new Duck("Skrudg");
    }
}
