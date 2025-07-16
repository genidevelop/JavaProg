public class EvenDivide {
    // Prints true if either number evenly divides the other.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean isDivisible = (a % b == 0);
        isDivisible = isDivisible || (b % a == 0);

        System.out.println(isDivisible);
    }
}
