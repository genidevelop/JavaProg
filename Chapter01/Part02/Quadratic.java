public class Quadratic {
    // Implementing the quadratic function.
    // The program doesn't check for error (negative discriminant).
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = (b * b - 4.0 * c);
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);
    }
}
