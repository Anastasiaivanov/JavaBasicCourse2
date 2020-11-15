package lesson08.Homework8;

import java.time.LocalDate;
import java.time.Period;

public class NewYear {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate newYear = LocalDate.of(2020, 12, 31);
        Period howManyDays = Period.between(today, newYear);
        System.out.println("Till the New Year left " + howManyDays.getMonths()
                + " months " + howManyDays.getDays() + " days!");
    }
}
