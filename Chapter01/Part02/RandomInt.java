public class RandomInt {
    // Generates a random number between a and b , inclusive.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        double r = Math.random();
        int value = (int) (r * Math.abs(a - b) + Math.min(a, b));

        System.out.println(value);
    }
}
