public class DayOfWeek {
    // Prints the day of the week that a given date falls on.
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        int year0 = year - (14 - month) / 12;
        int x = year0 + (year0 / 4) - (year0 / 100) + (year0 / 400);
        int month0 = month + 12 * ((14 - month) / 12) - 2;
        int day0 = (day + x + (31 * month0) / 12) % 7;

        switch (day0) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}
