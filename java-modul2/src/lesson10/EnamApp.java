package lesson10;

import java.util.Arrays;

public class EnamApp {
    public static void main(String[] args) {
        WeekDay firstDay = WeekDay.MONDAY;
        WeekDay forthDay = WeekDay.THURSHDAY;

       /* DayOfWeek monday = DayOfWeek.MONDAY;
        System.out.println(DayOfWeek.FRIDAY.ordinal());
        System.out.println(DayOfWeek.MONDAY.ordinal());
        System.out.println(Arrays.toString(DayOfWeek.values()));
        System.out.println(DayOfWeek.TUESDAY.getTitle());
        DayOfWeek.SUNDAY.sayHello();

        System.out.println(Gender.MALE);*/
        Schedule schedule = new Schedule();
        schedule.wakeUp(DayOfWeek.TUESDAY);
        schedule.wakeUp(DayOfWeek.SATURDAY);
        schedule.getMenuCantine(DayOfWeek.FRIDAY);
        schedule.displayWeekMenu();
    }
}
