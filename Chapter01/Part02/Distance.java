public class Distance {
    // Prints the Euclidean distance from the point (x, y) to the origin (0, 0).
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(x * x + y * y);

        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }
}
