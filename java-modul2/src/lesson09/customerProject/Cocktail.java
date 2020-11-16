package lesson09.customerProject;

import java.util.Arrays;

public class Cocktail {
    private String name;
    private Ingredient[] ingredients;
    private int liquid;

    public Cocktail(String name, Ingredient... ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cocktail{" +
                "name='" + name + '\'' +
                ", ingredient=" + Arrays.toString(ingredients) +
                ", liquid=" + liquid +
                '}';
    }
}

class Ingredient {
    private String name;
    private boolean alcohol;
    private int liquid;
    private int percentage;

    public Ingredient(String name, int liquid) {
        this.name = name;
        this.liquid = liquid;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", liquid=" + liquid +
                ", percentage=" + percentage +
                '}';
    }
}
