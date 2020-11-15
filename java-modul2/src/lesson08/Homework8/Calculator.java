package lesson08.Homework8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        String date;
        Scanner calc = new Scanner(System.in);
        System.out.println("Please enter a date in format " +
                "DD.MM.YYYY (for example 15.11.2020)");
        date = calc.next();
        LocalDate date1 = LocalDate.parse(date,
                DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("The Unix time from " + date + " is "
                + date1.atStartOfDay(ZoneId.systemDefault()).toEpochSecond());
    }
}
