
public class Quadratic {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double discriminant = (b * b - 4.0 * a * c);

        if (discriminant < 0) {
            System.out.println("No real root");
        } else if (a == 0) {
            System.out.println("Error division by zero");
        } else {
            System.out.println((-b + Math.sqrt(discriminant)) / (2 * a));
            System.out.println((-b - Math.sqrt(discriminant)) / (2 * a));
        }
    }
}
