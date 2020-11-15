package lesson08.Homework8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Human {
    String name;
    String birthday;

    public Human(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int getBirthday() {
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.parse(birthday,
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        Period age = Period.between(birthdate, today);
        return age.getYears();
    }
}

class HumanApp {
    public static void main(String[] args) {
        Human lena = new Human("Elena", "21.08.1986");
        Human pasha = new Human("Pavel", "14.11.2012");
        System.out.println(lena.name + " is " + lena.getBirthday() + " years.");
        System.out.println(pasha.name + " is " + pasha.getBirthday() + " years.");
    }

}
