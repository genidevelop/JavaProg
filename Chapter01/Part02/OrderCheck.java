public class OrderCheck {
    // Checks if the values are strictly ascending or descending
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        boolean isOrdered = x <= y && y <= z;
        isOrdered = isOrdered || (x >= y && y >= z);

        System.out.println(isOrdered);
    }
}
