package lesson09.customerProject;

public class Starter {
    public static void main(String[] args) {
        Ingredient vodka = new Vodka("Vodka", true, 40, 50);
        Ingredient cola = new Cola("Cola", false, 0, 150);
        Ingredient energiser = new Energetic("Red Bull", false, 0, 150);
        Ingredient peach = new Juice("Peach Juice", false, 0, 150);
        Ingredient tomato = new Juice("Tomato Juice", false, 0, 150);
        Ingredient tequila = new Tequila("Tequila", true, 40, 50);
        Ingredient lime = new Juice("Lime juice", false, 0, 50);
        Ingredient milk = new Milk("Milk", false, 0, 150);
        Ingredient banana = new Fruits("Banana", false, 0, 100);
        Ingredient kiwi = new Fruits("Kiwi", false, 0, 50);

        Cocktail disco = new Cocktail("Disco", cola, energiser);
        Cocktail sexOnTheBeach = new Cocktail("Sex on the beach", vodka, peach);
        Cocktail margarita = new Cocktail("Margarita", tequila, lime);
        Cocktail bloodyMary = new Cocktail("Bloody Mary", vodka, tomato);
        Cocktail milkShake = new Cocktail("Milkshake", milk, banana);
        Cocktail kidsSmoothie = new Cocktail("Kids smoothie", banana, kiwi);
        Cocktail kidsMilkshake = new Cocktail("Kids Milkshake", milk, banana, peach);

        Cocktail[] cocktailsInBar = new Cocktail[]{disco, sexOnTheBeach, margarita, bloodyMary, milkShake, kidsMilkshake, kidsSmoothie};

        System.out.println("Volume of cocktail " + disco.getName() + " is " + disco.volumeOfCocktail() + "ml, alcohol is " + disco.alcContent() + "%.");
        System.out.println("Volume of cocktail " + margarita.getName() + " is " + margarita.volumeOfCocktail() + "ml, alcohol is " + margarita.alcContent() + "%.");
        System.out.println("Volume of cocktail " + bloodyMary.getName() + " is " + bloodyMary.volumeOfCocktail() + "ml, alcohol is " + bloodyMary.alcContent() + "%.");
    }
}
