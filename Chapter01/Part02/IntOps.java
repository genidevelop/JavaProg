public class IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int total = a + b;
        int diff = a - b;
        int prod = a * b;
        int qot = a / b;
        int rem = a % b;

        System.out.println(a + " + " + b + " = " + total);
        System.out.println(a + " - " + b + " = " + diff);
        System.out.println(a + " * " + b + " = " + prod);
        System.out.println(a + " / " + b + " = " + qot);
        System.out.println(a + " % " + b + " = " + rem);

    }
}
