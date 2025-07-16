public class LeapYear {
    public static void main(String[] args) {
        // Checks if a given year is a leap year
        // A leap year is year divisible by 4 and not divisible by 100
        //                                  or divisible by 400.
        int year = Integer.parseInt(args[0]);
        boolean isLeap = (year % 4 == 0);
        isLeap = isLeap && (year % 100 != 0);
        isLeap = isLeap || (year % 400 == 0);

        System.out.println(isLeap);
    }
}
