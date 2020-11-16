package lesson09.customerProject;

class Ingredient {
    private String name;
    private boolean alcohol;
    private int alcPercentage;
    private int volume;

    public Ingredient(String name, boolean alcohol, int alcPercentage, int volume) {
        this.name = name;
        this.alcohol = alcohol;
        this.alcPercentage = alcPercentage;
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public int getAlcPercentage() {
        return alcPercentage;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", alcohol=" + alcohol +
                ", alcPercentage=" + alcPercentage +
                ", volume=" + volume +
                '}';
    }
}

class Vodka extends Ingredient {

    public Vodka(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Tequila extends Ingredient {

    public Tequila(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Energetic extends Ingredient {

    public Energetic(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Cola extends Ingredient {

    public Cola(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Juice extends Ingredient {

    public Juice(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Milk extends Ingredient {

    public Milk(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}

class Fruits extends Ingredient {

    public Fruits(String name, boolean alcohol, int alcPercentage, int volume) {
        super(name, alcohol, alcPercentage, volume);
    }
}