package lesson10;

public class Schedule {
    private DayOfWeek[] week;

    public Schedule() {
        this.week = DayOfWeek.values();
    }

    public DayOfWeek[] getWeek() {
        return week;
    }

    public void wakeUp(DayOfWeek dayOfWeek) {
        if (dayOfWeek.ordinal() < 5) {
            System.out.println("Wake up");
        } else {
            System.out.println("You can sleep longer");
        }
    }

    public void getMenuCantine(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                System.out.println("Spagetti");
                break;
            case TUESDAY:
                System.out.println("Chicken");
                break;
            case WEDNESDAY:
                System.out.println("Pizza");
                break;
            case THURSDAY:
                System.out.println("Fish chips");
                break;
            case FRIDAY:
                System.out.println("Kebab");
                break;
            case SATURDAY:
                System.out.println("Olivie");
                break;
            case SUNDAY:
                System.out.println("Borsch");
                break;
            default:
                System.out.println("No service");
                break;
        }
    }

    public void displayWeekMenu() {
        for (DayOfWeek day : week) {
            getMenuCantine(day);
        }

    }
}

