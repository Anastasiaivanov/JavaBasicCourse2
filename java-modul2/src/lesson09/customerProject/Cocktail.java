package lesson09.customerProject;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public double volumeOfCocktail() {
        double volumeCocktails = 0;
        for (Ingredient element : ingredients) {
            volumeCocktails = volumeCocktails + element.getVolume();
        }
        return volumeCocktails;
    }

    public int alcContent() {
        int alcOfCoctail = 0;
        for (Ingredient element : ingredients) {
            if (element.isAlcohol()) {
                alcOfCoctail = alcOfCoctail +
                        (int) ((element.getVolume() / volumeOfCocktail()) * element.getAlcPercentage());
           }
        }
        return alcOfCoctail;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                "ingredient=" + Arrays.toString(ingredients) +
                '}';
    }
}

