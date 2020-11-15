package lesson08.myFamily;

public class FamilyApplication {
    public static void main(String[] args) {
        Person hausmaster = new Person("Vasilii","M");
        Person vasilisa = new Person("Vasilisa","F");
        Family fam1 = new Family(hausmaster,vasilisa, "Golubkovi");

    }
}
