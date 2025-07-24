
public class Quadratic {
    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double discriminant = (b * b - 4.0 * c);

        if (discriminant < 0) {
            System.out.println("No real root");
        } else {
            System.out.println((-b + Math.sqrt(discriminant)) / 2);
            System.out.println((-b - Math.sqrt(discriminant)) / 2);
        }
    }
}
