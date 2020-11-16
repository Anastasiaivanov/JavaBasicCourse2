package lesson09.customerProject;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Ingredient("Vodka", 100);
        Ingredient martini = new Ingredient("Martini", 100);
        Ingredient rum = new Ingredient("Rum", 100);
        Ingredient cola = new Ingredient("Cola", 100);
        Ingredient energiser = new Ingredient("Red Bull", 100);

        Cocktail disco = new Cocktail("Disco", cola, energiser);
        System.out.println(disco);
    }
}
