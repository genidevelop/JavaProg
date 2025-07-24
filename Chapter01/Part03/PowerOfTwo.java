public class PowerOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int i = 0;
        int power = 1;
        while (i <= n) {
            if (power <= 0) {
                System.out.println("Error");
            } else {
                System.out.println(i + " " + power);
            }
            power *= 2;
            i++;
        }
    }
}
