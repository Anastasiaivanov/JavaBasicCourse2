package lesson08.myDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class HelloMyDate {
    public static void main(String[] args) throws ParseException {
        findBirthday();
        helloLocalDate();
        myZoneID();

        Date today = new Date();
        System.out.println(today);
        Date dateStart = new Date(0);
        System.out.println(dateStart);
        Date anotherDate = new Date(1_451_665_447_567L);
        System.out.println(anotherDate);
        Date theEnd = new Date(Long.MAX_VALUE);
        System.out.println(theEnd);
        split();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(anotherDate);
        System.out.println(calendar);
        split();
        System.out.println(calendar.getTime());
        calendar.setTime(new Date(120, 10, 12));
        System.out.println(calendar.getTime());
        calendar.add(Calendar.WEEK_OF_MONTH, 1);
        calendar.add(Calendar.MINUTE, 5);
        System.out.println(calendar.getTime());
        split();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormat.format(calendar.getTime()));
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat1.format(calendar.getTime()));
        split();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(simpleDateFormat1.format(calendar.getTime()));

        Calendar calendarToday = Calendar.getInstance();
        calendarToday.setTime(today);
        System.out.println(simpleDateFormat1.format(calendar.getTime()));

        Date veryOldDate = simpleDateFormat.parse("20/10/1965");
        System.out.println(veryOldDate);
    }

    private static void myZoneID() {
        LocalDateTime now = LocalDateTime.now();
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZoneId moscow = ZoneId.of("Europe/Moscow");
        ZonedDateTime inBerlin = ZonedDateTime.of(now,berlin);
        ZonedDateTime inMoscow = ZonedDateTime.of(now,moscow);
        System.out.println("Time in Berlin "+ inBerlin);
        System.out.println("Time in Moscow "+ inMoscow);

        LocalDateTime plusDays = now.plusDays(10);
        long between = ChronoUnit.DAYS.between(now, plusDays);
        System.out.println(between);

        

    }

    private static void helloLocalDate() {
        LocalDate localDate = LocalDate.now();
        LocalDate plusDays = localDate.plusMonths(5).plusDays(3).plusWeeks(3);
        System.out.println("Plus x is " + plusDays);
        LocalDateTime myLovelyParseDate = LocalDateTime.parse("2018-02-20 10:15:30", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(myLovelyParseDate);

        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern
                ("EEEE", new Locale(("de")));
        final String day = myLovelyParseDate.format(formatter);
        System.out.println(day);

        final DateTimeFormatter formatterMonth = DateTimeFormatter.ofPattern("MMMM", new Locale("ru"));
        final String month = myLovelyParseDate.format(formatterMonth);
        System.out.println(month);
    }

    private static void findBirthday() {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);
        LocalDate yesterday = LocalDate.of(2020,11,10);
        System.out.println(yesterday);
        LocalDate birthday = LocalDate.of(1950, 1,6);
        System.out.println(birthday);
        Period period = Period.between(birthday, today);
        System.out.println(period.getYears());
    }

    private static void split() {
        System.out.println("-------------");
    }

}
