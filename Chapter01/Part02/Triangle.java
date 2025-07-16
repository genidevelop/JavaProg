public class Triangle {
    // Tests whether the three numbers could be the lengths of the sides of some triangle.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isTriangle = !(a < 0) || !(b < 0) || !(c < 0);
        isTriangle = isTriangle && !(a >= b + c);
        isTriangle = isTriangle && !(b >= a + c);
        isTriangle = isTriangle && !(c >= a + b);

        System.out.println(isTriangle);
    }
}
