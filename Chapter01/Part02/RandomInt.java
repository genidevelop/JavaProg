public class RandomInt {
    // Generates a random number between 0 (inclusive) and n-1.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();
        int value = (int) (r * n);

        System.out.println(value);
    }
}
